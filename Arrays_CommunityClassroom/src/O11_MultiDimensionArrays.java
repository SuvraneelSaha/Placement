import java.util.Arrays;

public class O11_MultiDimensionArrays {
    public static void main(String[] args) {
        /*

        1 2 3
        4 5 6
        7 8 9

         */
        // syntax

        int[][] arr = new int[3][]; // Adding the row size is mandatory
        // the first one is the row size and the 2nd one is the column size

        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2 = {
                {1,2}, // 0th index
                {3,4,5,6}, // 1st index
                {7,8,9,10,11} // 2nd index  arr2[2] = { 7,8,9,10}
        };
        for (int[] num : arr2)
        {
            System.out.println(Arrays.toString(num));
        }






    }
}
