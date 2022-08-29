import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array ");
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }

        int[] res = new int[n];

        int count = 0;
        for (int i = 0; i <n ; i++)
        {
            for (int j = 1; j < 50 ; j++)
            {
                if(j*j == arr[i])
                {
                    res[i] = arr[i];
                    count++;

                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(res[i] + " ");
        }


    }
}
