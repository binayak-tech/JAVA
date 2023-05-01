import java.util.Scanner;

public class PracticeQuestions {
    
    static void questionOne() {
        // Write a program to take user input of marks of 3 subjects from a students
        // and find the percentage scored by that student. Marks are out of 100

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the marks of 3 subjects: ");
            int subA, subB, subC;

            subA = sc.nextInt();
            subB = sc.nextInt();
            subC = sc.nextInt();

            float total = subA + subB + subC;
            System.out.println("Your toatal marks is = "+total);

            float percentage = (total/300.0f) * 100.0f;

            System.out.println("You have scored: "+percentage+"%");
        }
        }

        static void questionTwo(){
            // Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text
            
            try (Scanner sc = new Scanner(System.in)){ 
                System.out.println("Hi user!\nWhat is your name?");
                String name = sc.nextLine();
                System.out.println("Hello "+name+", have a good day.");
            }
        }

        static void questionThree(){
            // Write a Java program to convert Kilometers to miles.

            try(Scanner sc = new Scanner(System.in)){
                System.out.print("Kilometers = ");
                int km = sc.nextInt();
                float mile = 1.6f;

                float kmToMiles = km / mile;

                System.out.println("Miles = "+kmToMiles);
            }
        }

        static void questionFour(){
            // Write a Java program to detect whether a number entered by the user is an integer or not.

            try(Scanner sc = new Scanner(System.in)){
                System.out.print("Enter a number: ");
                System.out.println("The number you entered is an Integer = "+sc.hasNextInt());
            }
        }
    
    public static void main(String[] args) {

        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        
    }
}
