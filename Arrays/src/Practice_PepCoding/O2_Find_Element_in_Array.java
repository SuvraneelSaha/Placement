package Practice_PepCoding;
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion
import java.util.Arrays;
import java.util.Scanner;

public class O2_Find_Element_in_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number ");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i <arr.length ; i++) // for taking input in the array
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array ="+ Arrays.toString(arr));

        System.out.println("Please enter the target Element :");
        int target = in.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if(target==arr[i])
            {
                System.out.printf("the index of the target position is %d",i);


            }

        }
        System.out.println("Element Not Found Index = "+-1); // the problem is this is also coming in the output
        // so we need to eliminate this
        // see solution in the next code
    }
}
