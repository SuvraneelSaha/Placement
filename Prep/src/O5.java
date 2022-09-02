import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        // if the search element is present in the Array find its place  ie index value
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

       // LinearSearch(arr,search);

        if(BinarySearch(arr,search)!= -1 )
        {
            System.out.printf("The search element %d is found at index %d",search,BinarySearch(arr,search));
        }
        else
        {
            System.out.printf("The search element %d is found at index %d",search,BinarySearch(arr,search));
        }

    }
    public static void LinearSearch(int[] arr,int search)
    {
        int i;
        for (i=0; i < arr.length; i++)
        {
            if(arr[i] == search)
            {
                System.out.printf("Search element %d found at %d index",search,i);
                break;
            }
        }
        if(i==arr.length)
        {
            System.out.printf("Search element %d not found , %d ",search,-1);

        }
    }

    // binary search only for ascending array
    public static int BinarySearch(int[] arr,int search)
    {

        int start = 0 ;
        int end = arr.length-1;

        while (start<=end)
        {
            int middle = start + (end-start)/2;

            if(search > arr[middle])
            {
                start = middle + 1 ;
            }
            else if(search < arr[middle])
            {
                end = middle -1 ;
            }
            else
            {
                return middle;
            }



        }
        return -1;
    }

}
