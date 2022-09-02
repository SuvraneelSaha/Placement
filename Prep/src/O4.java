import java.util.Arrays;
import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        // find a value which is present in the array or not
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("OG Array : "+ Arrays.toString(arr));

        System.out.println("Please enter the search value :");
        int search = in.nextInt();

        LinearSearch(arr,search);
        System.out.println();

        System.out.println(BinarySearch(arr,search));

    }
    // linear search method
    public static void LinearSearch(int[] arr,int search)
    {
        int i;
        for (i=0 ; i < arr.length; i++)
        {
                if(arr[i] == search)
                {
                    System.out.printf("Search element %d found",search);
                    break;
                }
        }
        if(i==arr.length)
        {
            System.out.printf("Search element %d not found ",search);

        }

    }

    // binary search method
    // for ascending order array only
    public static boolean BinarySearch(int[] arr,int search)
    {
        Arrays.sort(arr); // only for finding out if the value is present or not
        // in other cases if we use this it  will be a huge problem
        // as the indexes will be changed

        int start = 0 ;
        int end = arr.length-1;

        while (start<=end)
        {
            int middle = start + (end-start)/2;

            if(search > arr[middle])
            {
                start = middle+1;
            }
            else if(search<arr[middle])
            {
                end = middle-1;
            }
            else
            {
                return true;
            }



        }
        return false;
    }

}
