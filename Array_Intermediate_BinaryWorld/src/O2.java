import java.util.Arrays;
import java.util.Scanner;
// only print the unique elements not their duplicates
// ex -
// 7 6 7 6 9
// o/p - 7 6 9
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.printf("Please enter %d elements in the Array:",n);
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));


        // original elements in the Array :
        for (int i = 0; i < arr.length; i++)
        {
            int count = 0 ;
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
