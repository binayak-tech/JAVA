import java.util.Scanner;

public class opPracticeQuestions {

    static void questionOne(){
        //Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'A';
        System.out.println("Actual Grade: "+grade);
        char encryptedGrade = (char) (grade+8);
        System.out.println("Encrypted Grade: "+encryptedGrade);
        char decryptedGrade = (char) (encryptedGrade-8) ;
        System.out.println("Decrypted Grade: "+decryptedGrade);
    }

    static void questionTwo(){
        /* Use comparison operators to find out whether a given number is greater than,
          smaller than or equal to the user entered number.
        */
        int number = 78;
        System.out.print("Enter a two digit number: ");
        try(
            Scanner sc = new Scanner(System.in)
        ){
            int userNum = sc.nextInt();
            if(number == userNum){
                System.out.println("Both number are equal.");
            }
            else if(number < userNum){
                System.out.println("You number is greater than mine.");
            }
            else{
                System.out.println("Mine number is greater than yours");
            }
        }
        }
        
    
    public static void main(String[] args) {
        questionTwo();
    }
}
