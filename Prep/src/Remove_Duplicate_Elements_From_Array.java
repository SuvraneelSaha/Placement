import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate_Elements_From_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        System.out.println("og Array = "+ Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                list.add(arr[i]);
            }
        }
        System.out.println(list);

        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 0) return 0;
        int res = 1;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[i - 1])
            {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
