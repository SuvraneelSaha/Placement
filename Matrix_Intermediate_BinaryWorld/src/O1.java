import java.util.Arrays;
import java.util.Scanner;

public class O1 {
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



        for (int row = 0; row < arr.length; row++)
        {
            for (int col = n-1,k=0; col >=0 ; col--)
            {
                brr[k][row] = arr[row][col];
                k++;
            }
        }

        System.out.println("New Array:");
        for (int[] row : brr)
        {
            System.out.println(Arrays.toString(row));
        }


    }
}
