import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Enter a day number between 1 - 7");

        try(Scanner sc = new Scanner(System.in)){
            int day = sc.nextInt();

            switch(day){
                case 1: System.out.println("Its MONDAY");
                break;
                case 2: System.out.println("Its TUESDAY");
                break;
                case 3: System.out.println("Its WEDNESDAY");
                break;
                case 4: System.out.println("Its THURSDAY");
                break;
                case 5: System.out.println("Its FRIDAY");
                break;
                case 6: System.out.println("Its SATURDAY");
                break;
                case 7: System.out.println("Its SUNDAY");
                break;
                default: System.out.println("Invalid Number");
            }
        }

        // another way to use switch-case

        String var = "Saurabh";
        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are 17 years old!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
    }
}
