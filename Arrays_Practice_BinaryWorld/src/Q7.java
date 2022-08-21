import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    // Enter the size and elements of an array and physically store the array in reverse order.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array ");
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array : "+ Arrays.toString(arr));
        Reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Reverse(int[] arr)
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

     static void Swap(int[] arr, int start, int end)
     {
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
     }
}
