import java.util.Arrays;
import java.util.Scanner;

public class O13 {
    // shift up a matrix n places

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

        for (int z = 1; z <= 2 ; z++) // this is the climax of the question
            // Focus on the shifting of the matrix for only once
            // then add a loop above the whole process -- for the no. of times it will run
        {
        int[] temp = arr[0];




            for (int i = 0; i < n-1 ; i++)
            {
                arr[i] = arr[i+1];
            }

            arr[n-1] = temp;
        }

        System.out.println("New Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
