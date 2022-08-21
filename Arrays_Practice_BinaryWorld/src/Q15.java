import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    // Write a program to separate odd and even integers in separate arrays.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr =new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array = "+ Arrays.toString(arr));
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) // 5 3 4 2 1
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        int[] evenArray = new int[even];
        int[] oddArray = new int[odd];

        for (int i = 0,even_count=0,odd_count=0; i < arr.length; i++)
        {
                if(arr[i]%2==0)
                {
                    evenArray[even_count] = arr[i];
                    even_count++;
                }
                else
                {
                    oddArray[odd_count] = arr[i];
                    odd_count++;
                }
        }
        System.out.println("Odd Array = "+Arrays.toString(oddArray));
        System.out.println("Even Array = "+Arrays.toString(evenArray));


    }
}
