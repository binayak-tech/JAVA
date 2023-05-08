package methods;

public class MethodOverloading {

    // The change method is overloaded 

    void change(int x){
        x = 256;
    }

    void change(int[] arr){
        arr[0] = 55;
        arr[arr.length - 1] = 15;
    }

    /* METHOD OVERLOADING CANNOT BE PERFORMED BY CHANGING RETURN TYPE
    int change(int[] arr){
        arr[0] = 55;
        arr[arr.length - 1] = 15;
        return arr;
    }
    */

    void printValue(int x, int[] arr /*parameters*/){  // parameters are passed
        System.out.println("x = " + x);
        System.out.print("arr = {  ");
        for(int ele: arr){
            System.out.print(ele + "  ");
        }
        System.out.print("}");
    }


    public static void main(String[] args) {

        MethodOverloading obj1 = new MethodOverloading();

        int x = 22;
        int arr[] = {10,20,30,40,50};
        System.out.println("Before Change");
        obj1.printValue(x, arr);
        
        // calling change method
        obj1.change(x);
        obj1.change(arr /*argument*/); // arguments are actual

        System.out.println("\n\nAfter Change");
        obj1.printValue(x, arr);

        // only the copy of the primitive type data is passed as an argument, therefore change is not visible in original data.
        // whereas for derived data the memory reference is passed as an argument, therefore the change is visible in original data.
    }
}
