package Practice_PepCoding_Week1;

import java.util.Arrays;
import java.util.Scanner;

//link -  https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/rotate-an-array-official/ojquestion
public class O7_Rotate_an_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Enter a valid input Enter a number:");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();

        }
        System.out.println("OG Array = "+ Arrays.toString(arr));
        System.out.println("Please enter the K");
        int k=in.nextInt();

        Rotate(arr,k);

        System.out.printf("Rotated New Array with K=%d is "+Arrays.toString(arr),k);


    }
    public static void Rotate(int[] arr,int k)
    {
        k= k % arr.length;
        if(k<0)
        {
            k=k+arr.length;
        }

        // 1st part p1
        Reverse(arr,0,arr.length-k-1);
        // 2nd part p2
        Reverse(arr,arr.length-k,arr.length-1);

        // 3rd part Pwhole
        Reverse(arr,0,arr.length-1);

    }
    public static void Reverse(int[] arr , int i,int j)
    {
        int start = i;
        int end = j;
        while (start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
