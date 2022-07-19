package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O7 {
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
        Reverse(arr);
        System.out.println("Reversed Array :"+Arrays.toString(arr));
    }
    public static void  Reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }

    }
    public static void Swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
