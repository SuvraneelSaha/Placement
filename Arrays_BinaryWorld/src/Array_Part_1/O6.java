package Array_Part_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :"+ Arrays.toString(arr));
        reverse(arr);
    }

    public static void reverse(int[] arr)
    {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
