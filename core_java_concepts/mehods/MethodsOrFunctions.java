package mehods;
import java.util.Scanner;

public class MethodsOrFunctions {

    // This is the main method.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("First Number: ");
            int a = sc.nextInt();
            System.out.print("\nOperator: ");
            char op = sc.next().charAt(0);
            System.out.print("\nSecond Number: ");
            int b = sc.nextInt();

            // class object creation
            MethodsOrFunctions obj1 = new MethodsOrFunctions();

            if(op == '/'){
                double x = (double) a;
                double y = (double) b;
                System.out.printf("\n%d %c %d = %.2f", a, op, b, divideOp(x,y));
            }
            else{
                System.out.printf("\n%d %c %d = %d", a, op, b, (obj1.calculate(a,b,op)));
            }
        }

       
    }

    // This method can only be called using an object of the class.
    // This method name is calculate and it is taking 3 attributes and returning a integer.
    int calculate(int x, int y, char op){
        int ans = 0;
        switch(op){
            case '+': ans = x + y;
            break;
            case '-': ans = x - y;
            break;
            case '*': ans = x * y;
            break;
            case '%': ans = x % y;
            break;
            default: System.out.println("Invalid Input");
        }
        return ans;
    }

    // This is a static method called divideOp, it is taking 2 double inputs and returnig one double.
   static double divideOp(double x, double y){
        return x / y;
    }
}
