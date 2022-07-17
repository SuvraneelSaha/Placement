package Practice_PepCoding_Week2;
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse-of-an-array-official/ojquestion
import java.util.Arrays;
import java.util.Scanner;

public class O1_Inverse_of_An_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the numbers");

        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("ARRAY = "+ Arrays.toString(arr));


        System.out.println( Arrays.toString(Inverse(arr)));
    }
    // inverse of an Array
     static int[] Inverse(int[] arr)
     {
         int[] inverse = new int[arr.length];
         for (int i = 0; i <inverse.length ; i++)
         {
            int v = arr[i];
            inverse[v] = i;

         }
         return inverse;
    }
}
