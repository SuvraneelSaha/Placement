import java.util.Arrays;

public class O10_Array_Passing_in_Function {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr)
    {
        arr[0] = 99;
    }
}
