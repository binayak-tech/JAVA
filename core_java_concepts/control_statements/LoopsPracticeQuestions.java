import java.util.Scanner;

public class LoopsPracticeQuestions {
    
    
    static void questionOne(){
        // write a program to print first n odd numbers using for loop
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of odd numbers you want");
            int num = sc.nextInt();
            for(int i = 1; i <= num; i++){
                System.out.print((2*i+1) +", ");  // odd = 2n+1, even = 2n;
            }
        }
    }

    static void questionTwo(){
        /*
         * print the following pattern
            ****
            ***
            **
            *
         */

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of rows");
            byte numRow = sc.nextByte();

            for(byte i = numRow; i > 0; i--){
                for(byte j = 0; j<i; j++) 
                System.out.print("*");
               System.out.println("");
            }
        }
    }

    static void questionThree(){
        // write a program to print first n even numbers using for while loop
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of even numbers you want");
            int num = sc.nextInt();
            int i = 2;
            System.out.print(2 + ", ");
            while(i <= num){
                System.out.print((2*i) +", ");  // odd = 2n+1, even = 2n;
                i++;
            }
        }
    }

    static void questionFour(){
        // Write a program to find the factorial of a given number using for loops.
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            long num = sc.nextLong();
            long factorialNum = 1;
            for(long i = num; i>1; i--){
                factorialNum *= i;
            }
            System.out.println(factorialNum);
        }
    }

    
    public static void main(String[] args) {
        // questionOne();
        // questionTwo();
        // questionThree();
        questionFour();
    }
}
