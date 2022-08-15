import java.util.Arrays;
import java.util.Scanner;
// transpose of a square matrix

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();

            }
        }
        System.out.println("Original Matrix :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        // creating a new array of the same size
        int[][] brr =new int[n][n];

        // actual operation
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < arr[row].length ; col++)
            {
                brr[col][row] = arr[row][col];


            }
        }

        System.out.println("New Matrix :");
        for (int[] row : brr)
        {
            System.out.println(Arrays.toString(row));
        }


    }
}
