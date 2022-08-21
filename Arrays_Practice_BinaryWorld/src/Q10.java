import java.util.Arrays;
import java.util.Scanner;
// Enter the size and elements of an array. After that enter a search value and find the frequency
//of that value
public class Q10 {
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

        int count = Frequency(arr,search);
        System.out.printf("Frequency of %d is %d",search,count);
    }
    static int Frequency(int[] arr , int search)
    {
        int count = 0 ;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == search)
            {
                count++;
            }
        }
        return count;
    }
}
