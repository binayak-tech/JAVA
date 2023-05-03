/*  Multi-Dimensional arrays are the arrays where each element is also an array
        [[],[],[]], 
        [[],[],[]],
        [[],[],[]]
        This is a two dimensional array- it can be shown in the form of a matrix.
        example - two dimensional -->  int[][] arr = new int[][];
        example - three dimensional --> int[][][] arr = new int[][][];
*/

package arrays;

import java.util.Scanner;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int row = scan.nextInt();
        System.out.print("\nEnter number of columns: ");
        int col = scan.nextInt();


        int[][] arr = enterArray(scan, row, col);
        printMatrix(arr, row, col);
    }

    // initialization
    public static int[][] enterArray(Scanner scan,int row, int col){
        int[][] arr = new int[row][col];
        System.out.println("Enter 9 inputs for a two matrix of 3x3");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; col++){
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }
  
    // display
     public static void printMatrix(int[][] matrix, int row, int col){
       System.out.println("Your Matrix is : ");
           
           for (int i = 0; i < row; i++)
           {
               for (int j = 0; j < col; j++)
               {
                   System.out.print(matrix[i][j]+"\t");
               }
                
               System.out.println();
           }
     }
}
