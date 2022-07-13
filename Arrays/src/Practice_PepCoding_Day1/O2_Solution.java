package Practice_PepCoding_Day1;

import java.util.Arrays;
import java.util.Scanner;
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion
public class O2_Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number ");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i <arr.length ; i++) // for taking input in the array
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array ="+ Arrays.toString(arr));
        System.out.println("Enter Target element ");
        int tar = in.nextInt();
        int index = -1 ; // by default we are setting the value of the index as -1
        // so if by chance the element is not present inside the array
        // then the value of the index will be -1 by default as
        // the condition in the if statement is not met
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == tar)
            {
                index = i;
                break;
            }
        }
        System.out.printf("Index of the Target element %d is %d",tar,index);
    }
}
