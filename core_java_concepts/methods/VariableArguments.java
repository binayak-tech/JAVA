package methods;

class VariableArguments{

    static int sum(int ... arr){
        // ... is used when the number of arguments are unknown
        // this is storing all parameters into an array called arr
        int result = 0;
        for(int ele:arr){
            result += ele;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1,2 = " + sum(1,2));
        System.out.println("Sum of 2,3,4 = " + sum(2,3,4));
        System.out.println("Sum of 4,5,6,5,7,8,5,3 = " + sum(4,5,6,5,7,8,5,3));
    }
}