import java.util.Arrays;
import java.util.Scanner;

public class O1 { // 2319. Check if Matrix Is X-Matrix
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the 2D matrix ");
        int n=in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("please enter the elements in the 2D array");
        // for taking inputs
        for (int i = 0; i <n ; i++)
        {
            for (int j = 0; j <n ; j++)
            {
                   arr[i][j] = in.nextInt();
            }
        }
        // for output
        for (int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }

        System.out.println(checkXMatrix(arr));


    }
    public static boolean checkXMatrix(int[][] grid)
    {
        int n = grid.length;
        for (int row = 0; row <n ; row++)
        {
            for (int col = 0; col < grid[row].length ; col++)
            {
                if(row == col || row + col ==n-1)
                {
                    if (grid[row][col] == 0) {
                        return false;
                    }
                }
                else
                {
                    if(grid[row][col] != 0)
                    {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
