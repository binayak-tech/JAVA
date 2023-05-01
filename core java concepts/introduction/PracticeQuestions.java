import java.util.Scanner;

public class PracticeQuestions {
    
    static void questionOne() {
        // Qusestion - Write a program to take user input of marks of 3 subjects from a students
        // and find the percentage scored by that student. Marks are out of 100

        System.out.println("Enter the marks of 3 subjects: ");

        try (Scanner sc = new Scanner(System.in)) {
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
    
    public static void main(String[] args) {

        questionOne();
        
    }
}
