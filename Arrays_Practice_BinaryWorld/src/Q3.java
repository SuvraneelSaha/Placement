import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    // enter the size of the Array and its elements and
    // find the largest element present in the array

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

        Largest(arr);

    }
    static void Largest(int[] arr)
    {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];

            }
        }
        System.out.printf("the Largest element present in %d elements is %d ",arr.length,largest);
    }
}
