import java.util.Arrays;
import java.util.Scanner;

public class O15A {
    //shift left a matrix n number of times
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int r = in.nextInt();
        System.out.println("Please enter the size of the column :");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }
        System.out.println("Original Matrix :");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        for (int count = 0; count < 3; count++)
        {


        int[] temp = new int[r];
        for (int i = 0; i < r; i++) {
            temp[i] = arr[i][0];
        }

        int k = 1;
        for (int i = 0; i < c - 1; i++) {
            for (int j = 0; j < r; j++) {
                arr[j][i] = arr[j][k];

            }
            k++;
        }

        for (int i = 0; i < r; i++) {
            arr[i][c - 1] = temp[i];
        }
    }
        System.out.println("New Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
