package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :" + Arrays.toString(arr));
        System.out.println("Enter the Search Value:");
        int search = in.nextInt();
        int indexresult = LinearSearch(arr,search);
        System.out.printf("the index position of the %d is at %d",search,indexresult);

    }

    public static int LinearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}

