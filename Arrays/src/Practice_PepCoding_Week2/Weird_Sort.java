package Practice_PepCoding_Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Weird_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the numbers");

        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("ARRAY = "+ Arrays.toString(arr));

        int[] inverse = new int[n];

        for (int i = 0; i <n ; i++)
        {
            inverse[arr[i]] = arr[i];
        }

        System.out.println("inverse Array = "+Arrays.toString(inverse));

    }
}
