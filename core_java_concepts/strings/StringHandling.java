package strings;

public class StringHandling {
    public static void main(String[] args) {
        // There are many string hangling methods available in java programming language
        // In java strings are immutable, that means once the value is assigned it cannot be changed.
        // We can change its value in a copy of the actual variable but not in the same variable.
        String name = "Binayak Purohit";
        String strToTrim = "   Hie dude, You doing great!    "; 

        System.out.println("length()           -> " + name.length()); // length() returns length of the string
        System.out.println("toUpperCase()      -> " + name.toUpperCase()); // toUpperCase() returns all the characters of the string in uppercase
        System.out.println("toLowerCase()      -> " + name.toLowerCase()); // toLowerCase() returns all the characters of the string in lowercase
        System.out.println("replace()          -> " + name.replace("Binayak", "Ganesh")); // replace() replaces a single char or a sequence of chars
        System.out.println("replace()          -> " + name.replace(" ", "")); // replace() replaces a single char or a sequence of chars
        System.out.println("replaceFirst()     -> " + name.replaceFirst("i", "j")); // replaceFirst() replaces first occurance of the given string
        System.out.println("replaceAll()       -> " + name.replaceAll("i", "j")); // replaceAll() replaces all occurances of a string
        System.out.println("substring()        -> " + name.substring(6)); // substring(start) returns a substring from given starting position to the end - it gives -- Purohti
        System.out.println("substring()        -> " + name.substring(0, 7)); // substring(start,end) return a new string in the given range which incluedes start but not end.
        System.out.println("subSequence()      -> " + name.subSequence(6, 14)); // subSequence() Returns a new character sequence that is a subsequence of this sequence.
        System.out.println("startsWith()       -> " + name.startsWith("Bina")); // startsWith() returns ture if the string starts with the given value.
        System.out.println("startsWith()       -> " + name.startsWith("Ganesh")); // else returns false
        System.out.println("endsWith()         -> " + name.endsWith("it")); // endsWith() returns ture if the string ends with the given value.
        System.out.println("endsWith()         -> " + name.endsWith("sh")); // else returns false
        System.out.println("contains()         -> " + name.contains("yak")); // contains() checks if the actual string contains the given string, returns true or false
        System.out.println("equals()           -> " + name.equals("Binayak Purohit")); // equals() checks for equal string and returns true or false.
        System.out.println("equalsIgnoreCase() -> " + name.equalsIgnoreCase("binayak purohit")); // equals() checks for equal string and returns true or false.
        System.out.println("indexOf()          -> " + name.indexOf("i")); // indexOf() returns the index of first occurance of the given string, -1 if string is not found.
        System.out.println("indexOf()          -> " + name.indexOf("i",2)); // we can also specify from where it should start searching.
        System.out.println("lastIndexOf()      -> " + name.lastIndexOf("i")); // lastIndexOf() returns the index of last occurance of the given string, -1 if string is not found.
        System.out.println("lastIndexOf()      -> " + name.lastIndexOf("i", 10)); // we can also specify till where it should look
        System.out.println("lastIndexOf()      -> " + strToTrim.compareTo(name)); // compareTo() compares both string lexicographically by their unicode, returns 0 if equal <0 if (less characters) >0 if (more characters)       
        System.out.println("trim()             -> " + strToTrim.trim()); // trim() removes any white space before or after the actual string characters.
        System.out.println("getBytes()         -> " + strToTrim.getBytes()); // getBytes() Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array       
        System.out.println("hashCode()         -> " + strToTrim.hashCode()); // hashCode() Returns the hash code of a string       
        System.out.println("isEmpty()          -> " + strToTrim.isEmpty()); // isEmpty() Returns true if the string is empty       


    }
}
