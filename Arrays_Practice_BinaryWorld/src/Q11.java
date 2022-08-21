import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    // Enter the size and elements of an array and then find the middle most value.
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

        MiddleElement(arr);


    }
    static void MiddleElement(int[] arr)
    {
        if(arr.length % 2 ==0)
        {
            System.out.printf("The middle most element are %d and %d",arr[(arr.length/2)-1],arr[arr.length/2]);
        }
        else
        {
            System.out.printf("The middle most element is %d",arr[arr.length/2]);
        }
    }
}
