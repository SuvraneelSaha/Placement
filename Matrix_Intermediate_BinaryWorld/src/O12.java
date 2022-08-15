import java.util.Arrays;
import java.util.Scanner;

public class O12 {
    // shift down a matrix by one place

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n = in.nextInt();
        System.out.println("Please enter the size of the column :");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
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

        int[] temp = arr[n-1];

        int k =1;
        for (int i = n-2; i >=0 ; i--)
        {
            arr[n-k] = arr[i] ;
            k++;
        }

        arr[0] = temp;

        // printing the matrix
        System.out.println("New Matrix");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }


    }
}
