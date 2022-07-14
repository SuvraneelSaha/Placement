package Practice_PepCoding_Day1;

import java.util.Arrays;
import java.util.Scanner;

// reverse an array
// ex - og array given is - 10 20 30 40 50
// we need to reverse the actual array not print the array in the reverse way
// after reversing the og array it will become -
// 50 40 30 20 10
public class O6_Reverse_an_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number :");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array = "+ Arrays.toString(arr));

        Reverse(arr);
        System.out.println("New Reversed Array = "+Arrays.toString(arr));

    }
    public static void Reverse(int[] arr)
    {
        // we are passing the index here not the value 
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void Swap(int[] arr,int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
