package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the  array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(" OG Array :" + Arrays.toString(arr));
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 ==0)
            {
                even = even+1;
            }
            else
            {
                odd = odd +1;
            }
        }
        int[] evenArray = new int[even];
        int[] oddArray = new int[odd];

        for (int i = 0,j=0,k=0; i <arr.length ; i++) {
            if(arr[i]%2 == 0 )
            {
                evenArray[j] = arr[i];
                j++;
            }
            else
            {
                oddArray[k] = arr[i];
                k++;
            }

        }
        System.out.println("Odd Array = "+Arrays.toString(oddArray));
        System.out.println("Even Array = "+Arrays.toString(evenArray));


    }
}
