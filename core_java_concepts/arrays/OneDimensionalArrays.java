package arrays;

public class OneDimensionalArrays {
    // Array is a collection of homogeneous elements.   
    // syntax - type [] arr_name = {ele1,ele2,ele3...};
    // syntax - type [] arr_name = new type[size];
    // accessing array --> arr_name[index];
    // initializing array --> arr_name[index] = value;

    public static void main(String[] args) {
        // Declaration
        
        // int intArray[]; or 
        int[] intArray; 
        // byte byteArray[];
        // short shortsArray[];
        // boolean booleanArray[];
        // long longArray[];
        // float floatArray[];
        // double doubleArray[];
        // char charArray[];

        // Initialization
        intArray = new int[3];
        intArray[0] = 22; 
        intArray[1] = 24; 
        intArray[2] = 26; 

        // displaying an entire array by traversing
        for(int ele : intArray){
            System.out.print(ele+" ");
        }

        // one line declaration and initalization of array
        int[] newArr = {1,2,3,4,5,6,7,8,9};
        System.out.print("[ ");
        for(int ele : newArr){
            System.out.print(ele+", ");
        }
        System.out.print("]\n");

        // array lenght property gives length of an array.
        System.out.println("length = "+newArr.length); 
    }
}
