import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    // Enter the size and elements of an array. After that enter a search value and find if the value is
    //present in the array or not. If yes, find the places.

    /*
    And the search value is 30, then it will showa messagelike "30 is found at place 3, 30 is
found at place 5". If the search value is 90, the output will be as"90 is not found"

     */
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

        LinearSearch(arr,search);



    }
    static void LinearSearch(int[] arr,int search)
    {
        int flag = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == search)
            {
                flag = 1 ;
                System.out.printf("%d is found at %d",search,i+1);
                System.out.println();
            }
        }
        if(flag == 0)
        {
            System.out.printf("%d is not found",search);
        }

    }
}
