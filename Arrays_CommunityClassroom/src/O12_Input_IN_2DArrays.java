import java.util.Scanner;

public class O12_Input_IN_2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // for every row -- we take input of an Array
        // ex - arr[0] is the first row
        // so now we take input in the first row ie Array

        System.out.println(arr.length);
        // this will give the number of rows
        // no columns is concerned

        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //o/p
        for (int row = 0; row < arr.length ; row++) {
            // for each column in every row we need to take the input
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // after each row we need to new line
            // otherwise it will print all the elements in a single row
        }

    }
}
