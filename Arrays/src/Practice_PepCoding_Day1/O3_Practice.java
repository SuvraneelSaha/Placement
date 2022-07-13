package Practice_PepCoding_Day1;
import java.util.*;

public class O3_Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        // scanning done
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = in.nextInt();

        }

        Pattern(arr);


    }
    public static void Pattern(int[] arr)
    {
        int max = arr[0];

        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        // max element found

        // now the part of printing

        for(int floors = max ; floors>=1;floors--)
        {
            for(int buildings = 0 ; buildings<arr.length;buildings++)
            {
                if(arr[buildings]>=floors)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
