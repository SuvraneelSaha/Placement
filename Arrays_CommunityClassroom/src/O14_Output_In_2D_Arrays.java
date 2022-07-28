import java.util.Arrays;
import java.util.Scanner;

public class O14_Output_In_2D_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // this will give the number of rows
        // no columns is concerned
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // Output Method -1
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Output Method - 2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); // cause each element
            // inside of a 2d array of a matrix is an array itself
        }

        System.out.println("by enhanced for loop + Arrays.toString method ");
        // Output Method - 3
        for(int[] element : arr)
        {
            System.out.println(Arrays.toString(element));
        }
    }
}
