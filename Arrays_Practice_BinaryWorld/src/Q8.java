import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    //Enter the size and elements of an array. After that enter a search value and find if the value is
    //present in the array or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array ");
        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the search value:");
        int search = in.nextInt();
        System.out.println("OG Array : "+ Arrays.toString(arr));

        System.out.printf("The element %d is present in %d elements is %s",search,arr.length,LinearSearch(arr,search));


    }
    static boolean LinearSearch(int[] arr,int search)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == search)
            {
                return true;
            }
        }
        return false;
    }
}
