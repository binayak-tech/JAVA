public class loops_in_java {
    public static void main(String args[]) {
        
        // for loop
        System.out.println("This is generated using for loop");
        for(int i=1; i<=10; i++){
            System.out.print(i*11+", ");
        }

        // for-Each loop
        /* Syntax-
         * for (type variableName : arrayName) { 
         * code block to be executed 
         * }
         */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
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
        System.out.println("\n");

        // do while loop
        int i = 6;
        do {
        System.out.println(i);
        i++;
        }while (i < 5);
    }
}
