package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :" + Arrays.toString(arr));
        MiddleElement(arr);
    }
    static void MiddleElement(int[] arr)
    {
        int mid = 0 ;
        if(arr.length%2==0)
        {
            System.out.printf("the middle elements are %d and %d ",arr[arr.length/2-1],arr[arr.length/2]);
        }
        else
        {
            System.out.printf("the middle elements is %d  ",arr[arr.length/2]);
        }
    }
}
