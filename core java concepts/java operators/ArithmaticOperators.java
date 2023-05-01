public class ArithmaticOperators {
    // Arithmatic Operators are +,-,*,/,%,++,--,+=,-=,/=,*=,%=
    static void basicArithmaticOperators(int a, int b, int c){
        
        // basic arithmatic operators
        c = a + b; // additon 20
        c = a - b; // subtraction 15
        c = a * b; // multiplication 50
        c = a / b; // division 2
        System.out.println(c);

        // modulo operator
        c = a % b; // modulus (reminder) 0
        
    }
    static void incrementDecrementOperator(int a){

        a++; // post increment 10 (11)
        System.out.println(a);
        ++a; // pre increment 12
        a--; // post decrement 12 (11)
        --a; // pre decrement 10
    }

    static void arithmaticCompoundAssignmentOperators(int a, int b){
        b+=a; // b = b + a
        b-=a; // b = b - a
        System.out.println(b);
        b*=a; // b = b * a
        b/=a; // b = b / a
        b%=a; // b = b % a
    }

    public static void main(String[] args) {
       int a,b,c;
        a = 10;
        b = 5;
        c = 0;
        basicArithmaticOperators(a,b,c);
    }
}
