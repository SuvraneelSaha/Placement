package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O12_My_Method {
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
        System.out.println("Please enter the Rotation count");
        int k = in.nextInt();
        k=k%arr.length;
        if(k<0)
        {
            k=k+arr.length;
        }
        Rotate(arr,k);
        System.out.println("New Array :"+Arrays.toString(arr));

    }
    static void Rotate(int[] arr , int k)
    {
        // 1st part reverse
        Reverse(arr,0,arr.length-k-1);
        //2nd part reverse
        Reverse(arr,arr.length-k, arr.length-1);
        // 3rd part reverse
        Reverse(arr,0, arr.length-1);
    }
    static void Reverse(int[] arr ,int a , int b)
    {
        int start = a;
        int end = b;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void Swap(int[] arr,int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
