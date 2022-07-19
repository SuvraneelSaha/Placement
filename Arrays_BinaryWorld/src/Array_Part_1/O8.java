package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :"+ Arrays.toString(arr));

        System.out.println("Please enter the search value :");
        int search = in.nextInt();
        int temp = -1 ;
        for (int i = arr.length-1;i>=0;i--)
        {
            if(arr[i] == search)
            {
              temp = search;
            }
        }
        if(temp == search)
        {
            System.out.printf("%d Element Found ",temp);
        }
        else
        {
            System.out.printf("%d Element NOT  Found ",temp);
        }


    }
}
