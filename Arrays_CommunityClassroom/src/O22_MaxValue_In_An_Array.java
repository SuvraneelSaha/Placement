import java.util.Scanner;

public class O22_MaxValue_In_An_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the max value is "+max(arr));

        System.out.println("The max value in the range is "+maxinRange(arr,1,3));
    }
    // work on the edge cases by yourself
    // like array being null    or the size of the array being 0

    static int max(int[] arr)
    {
        if(arr == null)
        {
            return -1;
        }
        if(arr.length==0)
        {
            return -1;
        }
        int maxval = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    static int maxinRange(int[] arr , int index1 , int index2)
    {
        if(index2>index1)
        {
            return -1;
        }
        if(arr==null)
        {
            return -1;
        }
        int maxval = arr[index1];
        for (int i = index1; i <=index2 ; i++) {
            if(arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
