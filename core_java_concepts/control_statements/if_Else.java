import java.util.Scanner;

public class if_Else {
    public static void main(String[] args) {
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
}
