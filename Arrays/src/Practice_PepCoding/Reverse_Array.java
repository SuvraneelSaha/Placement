package Practice_PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // taking input accoridng to a pattern with the help of regular expression
        // if the regular expression matches with that of the input it takes the input
        // otherwise it doesnt takes in the input
        System.out.println("Please enter the size of the Array");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid Number");
            in.next(); // this is mandatory otherwise it will become an infinite loop
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        // above is the initialization of the new array
        System.out.println("Please enter the elements of the Array:");
        // taking input from the user
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        // Printing out the original Array
        System.out.println("Og Array = "+ Arrays.toString(arr));

        ReverseArray(arr);
        System.out.println("New Array = "+Arrays.toString(arr));

    }
    // using a separate function to do the operation of the reverse
    static void ReverseArray(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1;

        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }

    }
    // Swap function
    static void Swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
