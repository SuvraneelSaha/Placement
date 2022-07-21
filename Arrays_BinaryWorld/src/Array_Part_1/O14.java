package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the 1st array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the 1st Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("1st OG Array :" + Arrays.toString(arr));
        System.out.println("Please enter the size of the 2nd  array");
        int m = in.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Please enter the elements in the 2nd Array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        int[] result = new int[n+m];

        for (int i = 0; i <arr.length ; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i <arr1.length ; i++) {
            result[i+arr.length] = arr1[i];
        }
        System.out.println("The new Array is "+Arrays.toString(result));

    }
}
