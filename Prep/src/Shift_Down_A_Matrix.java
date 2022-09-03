import java.util.Arrays;
import java.util.Scanner;

public class Shift_Down_A_Matrix {
    public static void main(String[] args) {
        // shift down a matrix
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row  :");
        int n = in.nextInt();
        System.out.println("enter the size of the col  :");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("enter the elements :");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("OG matrix ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        Shift_Down_N_Places(arr,n,m,2);
    }
    public static void Shift_Down_1_Place(int[][] arr , int n,int m)
    {
        int[] temp = new int[m];

        for (int i = 0; i < m; i++)
        {
            temp[i] = arr[n-1][i];
        }

        for (int i = n-1; i >0 ; i--)
        {
            arr[i] = arr[i-1];

        }

        arr[0] = temp;

        System.out.println("RES Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void Shift_Down_N_Places(int[][] arr , int n , int m, int r) {
        for (int k = 0; k < r; k++) {


            int[] temp = new int[m];

            for (int i = 0; i < m; i++) {
                temp[i] = arr[n - 1][i];
            }

            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];

            }

            arr[0] = temp;

        }
        System.out.println("RES Matrix:");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }
}
