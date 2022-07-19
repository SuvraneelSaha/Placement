package Theory_Pepcoding;
// Implication of Array

public class O2_Arrays_Memory_3 {
    public static void main(String[] args) {
        // implication - 3 - Functions
        int[] arr = {11,12,13,14,15,16,15,18};


        swap(arr,0,4);

        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

    }
    public static void swap(int[] arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
