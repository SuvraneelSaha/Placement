import java.util.Arrays;
import java.util.Scanner;

public class O14A {

    // Shift right a matrix 2 times or places
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

        for (int count = 0; count <2 ; count++) // just a for loop for shifting n number of times

            // Step 1 : Focus on shifting only 1 time
            // then use a for loop for shifting n number of times
        {


            int[] temp = new int[r];
            for (int i = 0; i < r; i++) {
                temp[i] = arr[i][c - 1];
            }


            int k = c - 1;
            for (int i = c - 2; i >= 0; i--) {

                for (int j = 0; j < r; j++) {
                    arr[j][k] = arr[j][i];

                }
                k--;
            }

            for (int i = 0; i < r; i++) {
                arr[i][0] = temp[i];
            }
        }

        System.out.println("new Array :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
