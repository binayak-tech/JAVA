public class DataTypes {
    public static void main(String args[]){
        // Data types in java
        // Java is a strongly typed language, that means every variables need to have a type, and automatic type conversion does not happen in java.

        // There are basically 4 types of data - Integers, floating-point numbers, characters, boolean.
        // There are 8 primitive data types in java those are described below.
        // ---------------------------------------------------------------------------------------------------------
        // INTEGERS
        System.out.println("--INTEGERS--");
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 1999999999999999999l; // we have to append l or L at the end of long. Only then it will be long literal
        long days,seconds,distance;
        int lightspeed; 

        // approximate speed of light per seconds = 186000 miles
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = seconds * lightspeed;

        // NOTE - to perform arithmatic operation the values should be of same data type
        // d = a * b * c will give incorrect answer.

        System.out.println("byte range = "+a+"\nshort range = "+b+"\nint range = "+c+"\n long can be longer = "+d);
        System.out.println("Light will travel about "+distance+" miles in "+days+" days.\n");

        // ---------------------------------------------------------------------------------------------------------
        // FLOATING-POINT
        System.out.println("--FLOAT & DOUBLES--");

        // float specifies a single precision value that uses 32 bit storage
        float num = 10.8f; // we need to append f or F at the end of value for float literals.
        System.out.println("floating point number = "+num);
        float rupee, paisa;
        paisa = 48246;
        rupee = paisa / 100;
        System.out.println(""+paisa+" paisa = "+rupee+" rupees.");
        
        // NOTE - integer division not possible, for example float z = 10/6 would give 1.0 as answer not 1.6666667,
        // but 10.0/6.0 will give a correct result.
        // You cannot assign floating point values directly like float x = 10.11, you need to use 'f' such as 10.11f.
        // You can assign directly while using double


        
        // double specifies a double precision value that uses 64 bit storage
        double pi, r, area;
        pi = 3.1416;
        r = 10.8; // radius
        area = pi * r * r;
        System.out.println("Area of the circle of radius "+r+" is = "+area+".\n");

        // ---------------------------------------------------------------------------------------------------------
        // CHARACTERS
        System.out.println("--CHARACTERS--");
        // char in java is different then c or c++ as it uses unicode to represent characters, unicode can represent all
        // all the characters in human language. char can hold a single character inside a '' single quotations or it can
        // hold ASCCI value of any character.

        char ch1,ch2,ch3;
        ch1 = 65; // ASCCI value of A
        ch2 = 'B';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1+ " " +ch2);
        
        ch3 = ++ch2; // because char contains unicode it can be incremented or decremented.
        System.out.println("ch3: "+ch3);

        // ---------------------------------------------------------------------------------------------------------
        // STRING
        System.out.println("\n--STRING--");

        // A String is a sequence of characters and it shoud be surrounded usign double quotes, such as "I am Binayak".
        
        String name = "Binayak Purohit";
        System.out.println("My name is "+name+".");

        // ---------------------------------------------------------------------------------------------------------
        // BOOLEANS
        System.out.println("\n--BOOLEANS--");

        // Boolean can only two possible values true or false, it represents logical values.

        boolean value;
        value = false;
        System.out.println("value is: "+value);
        
        value = true;
        System.out.println("value is: "+value);

        // it can used in control statemts
        if(value){
            System.out.println("value is true so if block is executed.");
        }

        System.out.println("10>11 is: "+(10>11)); //it will return false

        
    }
}
