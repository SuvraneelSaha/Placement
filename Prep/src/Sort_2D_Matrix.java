import java.util.Arrays;
import java.util.Scanner;

public class Sort_2D_Matrix {
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

        SortMatrix(arr,n,m);

    }
    public static void SortMatrix(int[][] arr,int r , int c)
    {
        int[] res = new int[r*c];
        int k=0;
        for (int i = 0; i <  r ; i++)
        {
            for (int j = 0; j < c; j++)
            {
                res[k] = arr[i][j];
                k++;
            }
        }

        Arrays.sort(res);

        k=0;
        System.out.println("Sorted Matrix:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                arr[i][j] = res[k];
                k++;
            }
        }

        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
