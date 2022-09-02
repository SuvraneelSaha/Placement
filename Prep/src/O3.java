import java.util.Arrays;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        // physically store the array in reverse order
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("OG Array : "+ Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("Reversed Array : "+Arrays.toString(arr));

    }
    public static void Swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
