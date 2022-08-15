import java.util.Arrays;
import java.util.Scanner;

public class O14 {
    // shift right a matrix 2 places
    // Focus on the 1st step or shift
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int r = in.nextInt();
        System.out.println("Please enter the size of the column :");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < r; row++)
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

        int[] temp = new int[r];
        for (int i = 0; i < r; i++)
        {
            temp[i] = arr[i][c-1];
        }


        int k = c-1;
        for (int i = c-2; i >=0 ; i--)
        {

            for (int j = 0; j <r ; j++)
            {
                arr[j][k] = arr[j][i];

            }
            k--;
        }

        for (int i = 0; i < r ; i++)
        {
            arr[i][0] = temp[i];
        }

        System.out.println("new Array :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }







    }
}
