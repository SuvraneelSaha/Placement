package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O3 {
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
        int largest_Element = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest_Element)
            {
                largest_Element = arr[i];
            }
        }
        System.out.printf("The largest element in the Array is %d",largest_Element);
    }
}
