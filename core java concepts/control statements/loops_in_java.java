public class loops_in_java {
    public static void main(String args[]) {
        
        // for loop
        System.out.println("This is generated using for loop");
        for(int i=1; i<=10; i++){
            System.out.print(i*11+", ");
        }

        // while loop 
        System.out.println("\n\nThe powers of 5 are genereated using while loop");
        int count = 5;
        while(true){
            if(count > 1000000){
                break;
            }
            System.out.print(count+", ");
            count*=5;
        }
    }
}
