package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O5 {
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
        int smallestElement = arr[0];
        int LargestElement = arr[0];
        int sum = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]< smallestElement)
            {
                smallestElement = arr[i];
            }
            if(arr[i] > LargestElement)
            {
                LargestElement = arr[i];
            }
            sum = sum + arr[i];

        }
        System.out.printf("The smallest element in the Array is %d", smallestElement);
        System.out.println();
        System.out.printf("The Largest element in the Array is %d", LargestElement);
        System.out.println();
        System.out.printf("The Sum of the elements in the Array is %d", sum);
        System.out.println();
        System.out.printf("The Average of the elements is %d",sum/n);

    }
}
