import java.util.Arrays;

// the method that is described below is the actual two pointers method



public class O23_Reverse_an_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1;
        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr , int a , int b )
    {
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
}
