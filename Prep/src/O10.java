import java.util.Arrays;
import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Please enter the elements in the 2D array ");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col <n ; col++) {
                arr[row][col] =in.nextInt();
            }
        }


        // printing the 2D array
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }

        int[][] res = new int[n][n];

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                res[row][col] = arr[col][row];
            }

        }

        System.out.println("NEW Matrix : ");
        for (int[] row : res)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
