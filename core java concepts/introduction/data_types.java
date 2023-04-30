public class data_types {
    public static void main(String args[]){
        // Data types in java
        // Java is a strongly typed language, that means every variables need to have a type, and automatic type conversion does not happen in java.

        // There are basically 4 types of data - Integers, floating-point numbers, characters, boolean.
        // There are 8 primitive data types in java those are described below.

        // INTEGERS
        System.out.println("--INTEGERS--");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long days,seconds,distance;
        int lightspeed; 

        // approximate speed of light per seconds = 186000 miles
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = seconds * lightspeed;

        // NOTE - to perform arithmatic operation the values should be of same data type
        // d = a * b * c will give incorrect answer.

        System.out.println("byte range = "+a+"\nshort range = "+b+"\nint range = "+c);
        System.out.println("\nLight will travel about "+distance+" miles in "+days+".\n");

        // FLOATING-POINT TYPES
        System.out.println("--FLOAT & DOUBLES--");
        
    }
}
