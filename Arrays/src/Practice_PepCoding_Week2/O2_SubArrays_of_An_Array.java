package Practice_PepCoding_Week2;
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion
import java.util.Arrays;
import java.util.Scanner;

// sub arrays of an array
// ex - n = 3
// and the elements that are given are a, b, c
// then the sub arrays will be like
/*
a
a b
a b c
b
b c
c
 */
public class O2_SubArrays_of_An_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array ="+ Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k] +" ");
                }
                System.out.println();
            }
        }
    }
}
