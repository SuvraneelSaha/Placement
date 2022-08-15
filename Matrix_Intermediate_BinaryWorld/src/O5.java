import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n = in.nextInt();
        System.out.println("Please enter the size of the column :");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
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

        // taking a 1D array to store all the elements of the matrix in the Array
        int[] res = new int[n*m];
        // now putting the elements of the matrix in the array
        int k=0;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < arr[row].length ; col++)
            {
                res[k] = arr[row][col];
                k++;

            }
        }
       // System.out.println(Arrays.toString(res));

        // now we need to sort the matrix

        // bubble sort
        for (int i = 0; i < res.length-1 ; i++) // no of iterations :
        // the number of times the loop will run
        // this loop will run n-1 times cause the 1st element will be the smallest
        // and no need to run a loop for the lowest element
        {
            for (int j = 1; j < res.length; j++)
            {
                if(res[j-1]>res[j])
                {
                    // swap
                    int temp = res[j-1];
                    res[j-1]=res[j];
                    res[j] = temp;
                }
            }
        }

        // now putting the elements present in the array in the matrix
        int z=0;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < arr[row].length ; col++)
            {
              arr[row][col] = res[z];
                z++;
            }
        }

        System.out.println("New Sorted Matrix:");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }




    }
}
