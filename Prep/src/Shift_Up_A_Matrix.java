import java.util.Arrays;
import java.util.Scanner;

public class Shift_Up_A_Matrix {
    public static void main(String[] args) {
        // shift up a matrix by 1 place

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

        Shift_Up_N_Places(arr,n,m,4);

    }
    public static void Shift_Up_1_Place(int[][] arr,int r,int c)
    {
        int[] temp = new int[c];
        for (int i = 0; i < c; i++)
        {
                temp[i] = arr[0][i];
        }

        for (int i = 1; i < r; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[r-1] = temp;

        System.out.println("RES");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }


    }
    public static void Shift_Up_N_Places(int[][] arr,int r,int c,int n)
    {
        for(int k =0 ; k<n;k++) {
            int[] temp = new int[c];
            for (int i = 0; i < c; i++) {
                temp[i] = arr[0][i];
            }

            for (int i = 1; i < r; i++) {
                arr[i - 1] = arr[i];
            }

            arr[r - 1] = temp;
        }

        System.out.println("RES");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }

}
