package Array_Part_1;

import java.util.Arrays;
import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :" + Arrays.toString(arr));
        System.out.println("Enter the Search Value:");
        int search = in.nextInt();
        if(Frequency(arr,search)>0)
        {
            System.out.printf("Frequency of %d is %d",search,Frequency(arr,search));
        }
        else
        {
            System.out.printf("Frequency of %d is -1",search,Frequency(arr,search));
        }


    }
    static int Frequency(int[] arr ,int search)
    {
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == search)
            {
                count = count+1;
            }
        }
        if(count!=0)
        {
            return count;
        }
        else
        {
            return -1;
        }
    }
}
