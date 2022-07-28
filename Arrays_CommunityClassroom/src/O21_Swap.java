import java.util.Arrays;
import java.util.Scanner;

public class O21_Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10,20,30,40};
        System.out.println("Enter a");
       int a=in.nextInt();
        System.out.println("Enter b");
       int b=in.nextInt();

        System.out.println(Arrays.toString(arr));
        swap(arr,a,b);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr , int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
