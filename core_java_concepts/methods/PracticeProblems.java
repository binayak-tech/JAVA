package methods;
import java.util.Scanner;
public class PracticeProblems {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        
            PracticeProblems obj = new PracticeProblems();

            // QUESTION 1
            // System.out.println("Enter a number for multiplication table");
            // int num = sc.nextInt();
            // obj.multiplicationTable(num);


            // QUESTION 2 AND 4 
            // System.out.println("Enter a number for star pattern");
            // int patternNum = sc.nextInt();
            // obj.starPattern(patternNum);
            

            // QUESTION 3
            // System.out.println("Enter a number for sum of n natural numbers");
            // int naturalNumber = sc.nextInt();
            // int result = obj.sumOfNaturalNumbers(naturalNumber);
            // System.out.format("\nSum of %d natural numbers = %d", naturalNumber, result);


            // QUESTION 4
            // System.out.println("Enter a number");
            // int n = sc.nextInt();
            // int fibNumber = obj.fibonacciSequence(n);
            // System.out.format("The %dth number of fibonacci sequence is %d", n, fibNumber);
        
            
            // QUESTION 5
            obj.average(1,5,6,3,6,743,34,55);
        }
    }

    public void multiplicationTable(int n){
        // Java method to print multiplication of a number n

        for(int i = 1; i<=10; i++){
            System.out.format("%d x %d = %d \n", n, i, n*i);
        }
    }

    public void starPattern(int n){
    // pattern using functions  

        for(int i = 1; i <= n; i++){
            for(int j = i; j >= 1; j--){
                System.out.print("*  ");
            }
            System.out.println();
        }

        System.out.println();

        // in reverse
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
        
    }

    public int sumOfNaturalNumbers(int n){
        // sum of n natural numbers using recursion
        if(n>1){
            return n + sumOfNaturalNumbers(n-1);
        }
        return 1;
    }

    public int fibonacciSequence(int n){
        // Write a function to print the nth term of the Fibonacci series using recursion.
        // 0  1  1  2  3  5  8  13  21  34 ..... 


        if (n == 1 || n == 2){
            return n-1;
        }
        else{
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }
    }


    public void average(int ... arr){
        // Write a function to find the average of a set of numbers passed as arguments

        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        float avg = (float) sum / arr.length;

        System.out.println("Average of the given siquence of no = "+avg);
    }
}
