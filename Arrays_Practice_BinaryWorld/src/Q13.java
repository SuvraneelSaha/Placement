import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    //  Write a program to copy the elements of one array into another array.
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
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++)
        {
            newArray[i] = arr[i];
        }
        System.out.println("new Array = "+Arrays.toString(newArray));
        System.out.println("Old array = "+Arrays.toString(arr));
    }
}
