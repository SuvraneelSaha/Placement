import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println("OG Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // or can be done by Arrays.toString method
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println("Please enter the target element ");
        int target = in.nextInt();

        if (BinarySearch(arr, target) != -1) {
            System.out.println("The target element is present " + target);
        } else {
            System.out.println("The target element is NOT present " + target);
        }


    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid])
            {
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }


        }
        // if any of the above conditions does not gets executed then it will do the following
        // if the element is not present in the array then we can return -1
        // as -1 signifies that the element is not present in the Array
        return -1;

    }
}
