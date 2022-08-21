import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
    //Write a program to concatenate 2 arrays and store in a 3rd one.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please enter the elements in the Array ");
        for (int i = 0; i < n ; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("OG Array : "+ Arrays.toString(arr1));
        System.out.println("Please enter the size of the 2nd Array ");
        int m = in.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Please enter the elements in the 2nd Array :");
        for (int i = 0; i <arr2.length ; i++)
        {
            arr2[i] = in.nextInt();
        }
        System.out.println("OG Array 2 : "+Arrays.toString(arr2));

        int[] res = new int[n+m];
        for (int i = 0; i < arr1.length; i++)
        {
            res[i] = arr1[i];
        }
        for (int i =0; i < arr2.length; i++)
        {
            res[i+arr1.length] = arr2[i];
        }
        System.out.println("Concatenated Array = "+Arrays.toString(res));

    }
}
