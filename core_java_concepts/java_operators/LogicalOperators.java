public class LogicalOperators {
    // Logical Operators are --> &, |, ^, !, ||, &&,  ?:
    static void booleanLogicalOperators(){
        boolean a = true;
        boolean b = false;
        boolean c = a & b; // logica AND
        boolean d = a | b; // logical OR
        boolean e = a ^ b; // logical XOR
        boolean f = (!a & b) | (a & !b); // logical NOT
        System.out.println("          a = "+a);
        System.out.println("          b = "+b);
        System.out.println("        a|b = "+c);
        System.out.println("        a&b = "+d);
        System.out.println("        a^b = "+e);
        System.out.println("!a&b | a&!b = "+f);
    }

    static void shortCircuitLogicalOperators(){
        // short-circuit logical operators - &&, ||
        // if the left hand operand can decide the result then it will not evaluate right hand expresson
        // true | (no matter what) = true.... false & (no matter what) = false 
        
        int dnum = 0;
        int num = 10;
        if ((dnum != 0) && (num / dnum > 0)){
            System.out.println("if block is executed.");
        }
        else{
            System.out.println("else block is executed.");  
        }

        dnum = 2;
        if ((dnum != 0) || (num/dnum > 0)){
            System.out.println("if block is executed.");
        }
        else{
            System.out.println("else block is executed.");
        }
    }

    static void ternaryOperator(){
        // ternary operator is ?:
        // syntax value = expression1 ? expression2 : expression3 --> it is similar to if(expression1){expression2}else{expression3}
        int i, j, k;
        i = 10;
        j = -19;
        System.out.println("i = "+i+"\nj = "+j);
        k = i<0 ? -i : i; // get absolute value of i (if i is -ve the makes it positive)
        System.out.println("Absolute value of i = "+k);
        k = j<0 ? -j : j;
        System.out.println("Absolute value of j = "+k);
    }
    
    public static void main(String[] args) {
        ternaryOperator();
    }
}
