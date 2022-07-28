import java.util.Arrays;
import java.util.Scanner;

public class O9_Arrays_To_String_Class {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        // Array of primitives
        System.out.println(Arrays.toString(arr));

        String[] str = new String[5];
        for (int i = 0; i < str.length ; i++) {
            str[i] =in.next(); // string 
        }
        System.out.println(Arrays.toString(str));


        // there is an Arrays class
        // Arrays is the main class name
        // toString is the method
        // Arrays class has a .toString method
        //  when we give an array to it  converts the array into a string
        // internally its using for loop only like we are doing

        // just with some added features
    }
}

