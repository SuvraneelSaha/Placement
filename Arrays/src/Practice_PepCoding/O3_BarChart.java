package Practice_PepCoding;

import java.util.Arrays;
import java.util.Scanner;

// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion
public class O3_BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid Number");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of the Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
            
        }
        System.out.println("Og Array = "+ Arrays.toString(arr));

        Pattern(arr);
        
    }
    static void Pattern(int[] arr)
    {
        int max = arr[0];
        // first finding the max element in the array
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] >max )
            {
               max = arr[i];
            }
        }

        // now printing the pattern
        // the rows will be the floor levels
        // adn the columns will be the buildings

        for (int floor = max; floor >=1 ; floor--) {
            for (int buildings  = 0; buildings  < arr.length ; buildings ++)
            {
                if(arr[buildings] >= floor)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
