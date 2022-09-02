import java.util.Arrays;
import java.util.Scanner;

public class O7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Size:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("og Array = "+ Arrays.toString(arr));



        if(n%2==0)
        {
            int start = 0 ;
            int end = arr.length/2;
            int rotate = arr.length/2;
            for (int i = 1; i <=rotate ; i++)
            {

                Swap(arr,start,end);
                start++;
                end++;

            }
        }
        else
        {
            int start = 0 ;
            int end = (arr.length/2) + 1 ;
            int rotate = arr.length/2;
            for (int i = 1; i <= rotate ; i++)
            {

                Swap(arr,start,end);
                start++;
                end++;

            }

        }


        System.out.println("New Array "+Arrays.toString(arr));
    }
    static void Swap(int[] arr , int start , int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
