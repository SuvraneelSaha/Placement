import java.util.Arrays;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        // print the array in reverse order
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

        System.out.println("Printing it in a reverse format ");
        for (int i = n-1; i>=0  ; i--)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
