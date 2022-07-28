import java.util.Scanner;

public class O14_Output_In_2D_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        // this will give the number of rows
        // no columns is concerned
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // for o/p
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
