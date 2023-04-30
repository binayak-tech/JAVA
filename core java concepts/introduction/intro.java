/* Here we will discuss the basic concepts of java such as 
    variables, code blocks, data types, in-build methods etc...
*/

// class syntax = class class_name {}
class intro{

    /* main method dclaration = public - access control (public/private) main method must be public, 
    static - to initialize method statically and run by default without call, void - no retutn value (return type),
    main - function name, String - type of parameter, args - passed parameters, [] array of parameters passed
    */
    public static void main(String args[]) {

        // syntax for printing data or showing output on screen, 
        // println - method to print something followed by a new line

        System.out.println("Hello World");

        // VARIABLES AND DATA TYPES
         
        // syntax = data_type variable_name;
        int age; // dclaration
        age = 24; // intialization
        boolean can_watch = false;
        // CODE BLOCKS

        if( age >= 18 ){
            can_watch = true; 
        }
        else{
            can_watch = false;
        }

        if(can_watch) {
            System.out.println("Student is an Adult");
        }else{
            System.out.println("Student is a Teenager");
        }
        // Everything inside { } braces are considered as block of code and all are compiled and executed together.

    }
}