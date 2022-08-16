import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter an integer");
            in.nextInt();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.printf("Please enter %d elements in the Array:",n);
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        int count = 0 ;
        for (int i = 0; i < n; i++)
        {

            for (int j = i+1; j < n; j++)
            {
                    if(arr[i] == arr[j])
                    {
                        count++;
                        break;
                    }
            }
        }
        System.out.println("the Number of Duplicate Elements are : "+count);


    }
}
