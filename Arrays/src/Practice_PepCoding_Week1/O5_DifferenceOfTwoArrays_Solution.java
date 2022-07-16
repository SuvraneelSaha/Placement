package Practice_PepCoding_Week1;
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion
import java.util.Arrays;
import java.util.Scanner;

// keep that in mind the arr1 is getting substracted from arr2


public class O5_DifferenceOfTwoArrays_Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // taking input for the 1st array

        System.out.println("Please enter the size of the Array");
        int n = in.nextInt();
        int[] a1 = new int[n];

        System.out.println("Please enter the elements of the 1st Array:");
        for (int i = 0; i < a1.length ; i++) {
            a1[i] = in.nextInt();

        }
        // printing the og 1st array to get display
        System.out.println("Og Array 1st Array= "+ Arrays.toString(a1));

        // taking input for the 2nd array
        System.out.println("Enter the size of the 2nd array:");
        int m = in.nextInt();
        int[] a2 = new int[m];
        System.out.println("Please enter the elements of the 2nd Array:");
        for (int i = 0; i < a2.length ; i++) {
            a2[i] = in.nextInt();
        }
        // printing the og 2nd array to get display
        System.out.println("Og Array 2nd Array = "+Arrays.toString(a2));

        int[] diff = new int[m];
        // as the size of the 2nd array is > the 1st array according to the question
        // we are substracting arr1 from arr2 so that means a2 > a1

        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        int carry = 0;

        // the operation will carry out from the size of diff to 0
        // ie for the entire array of diff
        while (k>=0)
        {
            // now the question comes from which to minus and whom to minus
            // we need to substract a1 from a2
            int d=0;
            int a1value = i>=0?a1[i]:0;
            // here what we are doing is that
            // for example - 1000 - 1 = 999
            // but the a1 contains only 1 element and whereas the a2 array has 4 elements
            // so during iteration the value of i will become -1 -2 -3 which will give error
            // so we have to arrange this
            // whenever the value of i becomes lesser than 0 we will make take the value as 0
            // otherwise in normal case when the i's value will be >=0 that means the elements are present in the
            // a1 array ; we will take that value only ie a1[i]'s value
            if(a2[j] + carry >= a1value)
                // if the upper element ie a2[j] is greater than the a1[i] ie the lower number
                // then we substract simply
                // and there would be no carry in this case ie carry = 0
            {
                d= a2[j] + carry - a1value;
                carry = 0;
            }
            else
                // in this case the upper element ie a2[j] is smaller than the a1[i] ie the lower number
            // the we have to add 10 to a2[j] and carry then substract a1[j] from it
            // and in this case the carry woulbe be -1
            {
                d= a2[j]+carry+10 - a1value;
                carry = -1 ;
            }

            diff[k] = d;

            // the ith pointer and j th pointer may run differently but it is evident from the question
            // that the ith pointer will edd first as
            // we are substracting a2 - a1 and i is the pointer of a1 and j is the pointer of a2
            // so whenever the ith pointer will end it will contribute 0 for substraction
            // from a2[j] - a1[i] = a2[j] - 0


            i--;
            j--;
            k--;
        }

        // now here comes the printing part
        //ex - 1000-999 = 0001
        // it will come like this and we dont need to 0s

        int index = 0 ;
        while (index<diff.length)
        {
            if(diff[index] ==0)
            {
                index++;

            }
            else
            {
                break;
            }
        }

        // now printing the actual numbers without 0s
        while (index<diff.length)
        {
            System.out.print(diff[index]);
            index++; // cause we need to rest of the elements present in the array
        }

    }
}
