/*
 * Recursion means a function or method calling itself recursively. 
 * 
 */
package methods;
import java.util.Scanner;
public class Recursion {

    public int factorial(int x){
        if(x>=1){
            return x * factorial(x-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("-------FACTORIAL-------\n");
        Recursion obj = new Recursion();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            int result = obj.factorial(num);

            System.out.printf("\nFactorial of %d = %d", num, result);
        }

    }
}
