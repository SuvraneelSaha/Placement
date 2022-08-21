import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    // Write a program for addition of two arrays of same size
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
        int[] arr2 = new int[n];
        System.out.println("Please enter the elements in the 2nd Array :");
        for (int i = 0; i <arr2.length ; i++)
        {
            arr2[i] = in.nextInt();
        }
        System.out.println("OG Array 2 : "+Arrays.toString(arr2));

        AddTwoArrays(arr1,arr2);



    }
    static void AddTwoArrays(int[] arr1 , int[] arr2)
    {
        for (int i = 0; i < arr1.length; i++)
        {
            arr1[i] = arr1[i] + arr2[i];
        }
        System.out.println("Resultant Array = "+Arrays.toString(arr1));
    }

}
