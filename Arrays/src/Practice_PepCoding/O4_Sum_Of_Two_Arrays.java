package Practice_PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class O4_Sum_Of_Two_Arrays {
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


//        if(m>n)
//        {
//            int[] arrFinal = new int[m];
//        }
//        else
//        {
//            int[] arrFinal = new int[n];
//        }

        int[] sum = new int[n > m ? n : m]; // same as the above one
        // here just we are using ternary operators

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        int c = 0 ;
        while (k>=0)
        {
            int d = c ;

            if(i>=0)
            {
                d=d+arr1[i];
            }

            if(j>=0)
            {
                d=d+arr2[j];
            }

            // finding the last digit
            // finding the carry
            c=d/10;
            d= d%10;

            sum[k] = d ;

            i--;
            j--;
            k--;


        }

        if(c!=0)
        {
            System.out.print(c);
        }

        for (int l = 0; l < sum.length; l++)
        {
            System.out.print(sum[l]);
        }

    }
}
