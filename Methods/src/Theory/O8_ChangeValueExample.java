package Theory;

import java.util.Arrays;

public class O8_ChangeValueExample {
    public static void main(String[] args) {
        int[] arr ={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums)
    {
        nums[0] = 99;
        // if you make a change to the object via this ref var
        // same object will be changed
    }
}
// in this case the value will be changed
// as we are changing the actual or original value with the help of the reference variable
// but in other cases we were creating a new value for the ref var present inside the function
