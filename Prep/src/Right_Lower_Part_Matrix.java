import java.util.Arrays;
import java.util.Scanner;

public class Right_Lower_Part_Matrix {
    public static void main(String[] args) {
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

        Right_Lower(arr,n,m);
    }
    public static void Right_Lower(int[][] arr, int r, int c) {
        for (int row = 0; row < r; row++)
        {
            for (int col = 0; col < c; col++)
            {
                if(row+col>=r-1)
                {
                    System.out.print(arr[row][col] + "\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
