import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    //Enter the size and elements of an array and find the average, largest,smallest and the sum
    // together using a single loop.
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

        Operations(arr);
    }
    static void Operations(int[] arr)
    {
        int sum = 0 ;
         int largest = arr[0];
         int smallest = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];

            }
            if(arr[i]<smallest)
            {
                smallest = arr[i];
            }

            sum = sum + arr[i];

        }
        System.out.printf("the largest element present %d elements is %d ",arr.length,largest);
        System.out.println();
        System.out.printf("the smallest element present %d elements is %d ",arr.length,smallest);
        System.out.println();
        System.out.printf("the sum of the %d elements is %d ",arr.length,sum);
        System.out.println();
        System.out.printf("the average of the %d elements is %d ",arr.length,sum/ arr.length);


    }
}
