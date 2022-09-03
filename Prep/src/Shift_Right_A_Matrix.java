import java.util.Arrays;
import java.util.Scanner;

public class Shift_Right_A_Matrix {
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

        Shift_Right_N_Places(arr,n,m,1);
    }
    public static void Shift_Right_1_Place(int[][] arr , int n , int m)
    {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)
        {
                temp[i] = arr[i][m-1];
        }

        for (int row = m-2; row >=0 ; row--)
        {
            for (int col = 0; col < m; col++)
            {
                    arr[col][row+1] = arr[col][row];
             }
        }


        for (int i = 0; i < n; i++)
        {
            arr[i][0] = temp[i];
        }


        System.out.println("Res Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
    public static void Shift_Right_N_Places(int[][] arr , int n,int m,int r)
    {
        for (int k = 0; k < r; k++)
        {

            int[] temp = new int[n];
            for (int i = 0; i < n; i++)
            {
                temp[i] = arr[i][m-1];
            }

//            int z = m-1;
//            for (int row = m-2; row >=0 ; row--)
//            {
//                for (int col = 0; col < m; col++)
//                {
//                    arr[col][z] = arr[col][row];
//                }
//                z--;
//            }

            // problem was in m
            // the col will be from 0 to n-1

            int z = m-1;
            for (int i = m-2; i >=0 ; i--)
            {

                for (int j = 0; j <n ; j++)
                {
                    arr[j][z] = arr[j][i];

                }
                z--;
            }


            for (int i = 0; i < n; i++)
            {
                arr[i][0] = temp[i];
            }
        }
        System.out.println("Res Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

    }

}
