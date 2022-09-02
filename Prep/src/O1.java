import java.util.Scanner;

public class O1 {
    // enter the size and elements of an arrray and find the average , largest ,
    // smallest and the sum using a single for loop
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array : ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        int sum = 0 ;

        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 0; i < n; i++)
        {
                if(arr[i] > largest)
                {
                    largest = arr[i];
                }

                if(arr[i] < smallest)
                {
                    smallest = arr[i];

                }

                sum = sum + arr[i];


        }

        System.out.printf("the Average of %d numbers is %d",n,sum/n);
        System.out.printf("the Largest of %d numbers is %d",n,largest);
        System.out.printf("the smallest of %d numbers is %d",n,smallest);

    }
}
