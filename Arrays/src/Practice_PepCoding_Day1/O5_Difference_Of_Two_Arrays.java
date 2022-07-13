package Practice_PepCoding_Day1;

import java.util.Arrays;
import java.util.Scanner;

public class O5_Difference_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid Number");
            in.next();
        }
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please enter the elements of the 1st Array:");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = in.nextInt();

        }
        System.out.println("Og Array = "+ Arrays.toString(arr1));
        System.out.println("Enter the size of the 2nd array:");
        int m = in.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Please enter the elements of the 2nd Array:");
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println("Og Array = "+Arrays.toString(arr2));

      //  int[] diff = new int[m>n?m:n]; // this is true if the size if different what if the size of both the
        // arrays is not different

           int[] diff = new int[m>n?m:n];


        int j = arr1.length-1;
        int i = arr2.length-1;
        int k = diff.length-1;

      //  int carry = 0;
        while (k>=0)
        {
            int d=0;
            if(arr2[i] < arr1[j])
            {
                arr2[i] = 10 + arr2[i];
                d = arr2[i] - arr1[j];
                diff[k] = d;
                if(j>=0)
                {
                    arr1[j-1] = 1+arr1[j-1];
                }
                else
                {
                    System.out.printf("%d",arr2[0]-1);
                }

            }
            else if(arr2[i] >= arr1[j])
            {
                d=arr2[i] - arr1[j];
                diff[k] = d;
            }
            i--;
            j--;
            k--;
        }
        for (int val : diff)
        {
            System.out.print(val);
        }

    }
}
