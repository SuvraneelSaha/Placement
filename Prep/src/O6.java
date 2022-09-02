import java.util.Arrays;
import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        // find the middle most element
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

        if(arr.length%2==0)
        {
            System.out.printf("the middle most element are %d and %d ",arr[arr.length/2] , arr[(arr.length/2)-1]);
        }
        else
        {
            System.out.printf("the middle most element are %d  ",arr[arr.length/2] );
        }
    }
}
