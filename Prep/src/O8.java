import java.util.Arrays;
import java.util.Scanner;

public class O8 {
    public static void main(String[] args) {
        // Separate odd and even integers in separate arrays
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

        int even_Count = 0 ;
        int odd_Count = 0 ;
        for (int i = 0; i < n; i++)
        {
            if(arr[i]%2==0)
            {
                even_Count++;
            }
            else
            {
                odd_Count++;
            }
        }

        int[] even_Arr = new int[even_Count];
        int[] odd_Arr = new int[odd_Count];

        even_Count = 0 ;
        odd_Count = 0 ;
        for (int i = 0; i < n; i++)
        {
            if(arr[i] % 2 ==0)
            {
                even_Arr[even_Count] = arr[i];
                even_Count++;
            }
            else
            {
                odd_Arr[odd_Count] = arr[i];
                odd_Count++;
            }
        }

        System.out.println("Even Array "+Arrays.toString(even_Arr));
        System.out.println("ODD Array "+Arrays.toString(odd_Arr));
    }
}
