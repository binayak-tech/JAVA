package strings;

public class BasicString{
    public static void main(String[] args) {
        // String is a dedicated class in java. It can also be used as a class and objects can be created.
        // It can also be used as a data type.

        String firstName = new String("Binayak");
        String lastName = "Purohit";

        System.out.println("My name is "+firstName+" "+lastName);

        // A String stroes a sequence of characters inside double quotes "".

        //STRING CONCATENATION
        // Multiple string objects can be concatenated using + symbol.

        String str1, str2, str3;
        str1 = "My name is Binayak Purohit.";
        str2 = "I live in Hyderabad city.";
        str3 = str1 +" "+ str2;

        System.out.println(str3);

        /*  Value stored inside a string object variable is nothing but a character array.
            for example String let = "abc"; ==> char let[] = {'a', 'b', 'c'}; 
        */
        char helloArray[] = { 'h', 'e', 'l', 'l', 'o', '.' };
        char numberArray[] = {'1', '2', '3', '4', '5'};
        String helloString = new String(numberArray);
        System.out.println(helloString);
        System.out.println(helloArray);
    }
}