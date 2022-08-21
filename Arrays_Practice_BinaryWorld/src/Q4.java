import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    // enter the size of the Array and its elements and
    // find the smallest element present in the array
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

        Smallest(arr);

    }
    static void Smallest(int[] arr)
    {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                smallest = arr[i];

            }
        }
        System.out.printf("the smallest element present in %d elements is %d ",arr.length, smallest);
    }
}
