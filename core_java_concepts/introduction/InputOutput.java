import java.util.Scanner; //importing Scanner class

public class InputOutput {
    public static void main(String[] args) {
        // OUTPUT - to give any output we can use print or println method
        // to write any string we use "" double quotation and to append any variable we use + 

        System.out.println("This is println method which appends a new line after the output");
        System.out.print("This is print method which print everythin on same line\n");
       
        int num = 1998;
        System.out.printf("The value of the num = %d.",num);
        System.out.format("\nThe value of the num = %d.",num); 
        // both printf and format method works the same way. They dont leave any new line behind.
        // and they use format specifiers such as %d, %f, %s for int, float and string respectively.


        try (
        //INPUT - to take input we use Scanner class (and we need to import it first)
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();

            System.out.println("Sum of first and second number is: "+(num1+num2));
            /*
             METHODS IN SCANNER CLASS
             nextInt() - method to capture integer input
             similarly 

             nextFloat() 
             nextDouble()
             nextShort()
             nextByte()
             nextLong()
             nextBoolean()
             next() --  captures a single word at a time
             nextLine() -- captures a complete line of string until \n charchter is reached
             */
        }
    }
}
