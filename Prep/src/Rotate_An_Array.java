import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// rotate an array
public class Rotate_An_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("og Array :"+ Arrays.toString(arr));
        System.out.println("please enter the rotation count ");
        int rotate = in.nextInt();

        for (int k = 0; k <rotate ; k++)
        {


            int temp = arr[arr.length - 1];

            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];

            }
            arr[0] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
