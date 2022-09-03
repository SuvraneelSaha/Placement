import java.util.Arrays;
import java.util.Scanner;

// only for the matrix like show
// not to be represented like an array
// in that case just traverse the 0th row, last col , last row then 1st col

public class Border_Elements {
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




        borderElements(arr,n,m);

    }
    static void borderElements(int[][] arr,int r,int c)
    {
        for (int i = 0; i <r ; i++)
        {
            for (int j = 0; j <c ; j++)
            {
                if(i==0 || i==r-1 || j==0 || j==c-1)
                {
                    System.out.print(arr[i][j] + "\t");
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
