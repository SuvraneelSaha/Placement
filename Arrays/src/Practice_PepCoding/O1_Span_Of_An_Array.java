package Practice_PepCoding;

import java.util.Arrays;
import java.util.Scanner;

// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span-of-array-official/ojquestion
public class O1_Span_Of_An_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i <arr.length ; i++) // for taking input in the array
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array ="+ Arrays.toString(arr));

        // the story behind the max and min

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }

            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("Max = "+max);
        System.out.println("Min = "+min);

        System.out.printf("The difference =%d ",max-min);

    }
}
