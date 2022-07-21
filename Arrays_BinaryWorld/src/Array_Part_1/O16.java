package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the   array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the 1st Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(" OG Array :" + Arrays.toString(arr));
        int[] arr1 = new int[n];
        System.out.println("Please enter the elements in the 2nd Array: ");
        for (int i = 0; i<n;i++){
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i <n ; i++) {
            arr[i] = arr[i] + arr1[i];
        }
        System.out.println("Addition of Two Arrays = "+Arrays.toString(arr));


    }
}
