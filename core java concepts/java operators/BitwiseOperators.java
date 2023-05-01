public class BitwiseOperators {
    // Bitwise operators are --> ~, &, |, ^, >>, >>>, <<, &=, |=, ^=, >>=, >>>=, <<= 
    static void bitwiseLogicalOperators(){
        // bitwise operators works mainly on the binary values.
        // USE CASE

        /*
         bitwise NOT ~ ==> a=0010010, ~a=1101101
         bitwise AND & ==> 1&1 = 1 everything else 0
           00101010
         & 00001111
         __________
           00001010

           similarly 
         bitwise OR | ==> 0|0 = 0 everything else 1
         bitwise XOR ^ ==> 0^0, 1^1 = 0 ELSE 1

         */

        String binary[] = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };
        int a = 3; // 0011 in binary
        int b = 6; // 0110 in binary
        int c = a & b; // bitwise logica AND
        int d = a | b; // bitwise logical OR
        int e = a ^ b; // bitwise logical XOR
        int f = (~a & b) | (a & ~b); // bitwise logical NOT
        int g = ~a & 0x0f;

        System.out.println("          a = " + binary[a] );
        System.out.println("          b = " + binary[b] );
        System.out.println("        a|b = " + binary[c] );
        System.out.println("        a&b = " + binary[d] );
        System.out.println("          a = " + binary[a] );
        System.out.println("        a^b = " + binary[e] );
        System.out.println("!a&b | a&!b = " + binary[f] );
        System.out.println("         ~a = " + binary[g] );
    }

    static void bitwiseLeftShift(){
        // value << num
        /*
         example - a = 64 = 1000000 
         a << 2 => 100000000 = 256
            multiplies by 2
         */

        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("original a = "+a+" 1000000");
        System.out.println("after shift by 2 a = "+i+" 100000000");
        System.out.println("b = "+b+" because its max range is exeeded and it hold only 00000000");
    }
    static void bitwiseRightShift(){
        // value >> num
        /*
         example - a = 35 = 00100011 
         a >> 2 => 0001000 = 8

         most significant bit is replaced
         example - a = 64 = 1000000 
         a >> 2 => 1110000 = 112
         */
        int a = -8, b;
        b = (a >> 1);
        System.out.println("original a = "+a);
        System.out.println("after right shift by 2 = "+b);

    }

    public static void main(String[] args) {
        bitwiseRightShift();
    }
}
