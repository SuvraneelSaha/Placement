package Practice_PepCoding_Week2;

import java.util.Scanner;

// subsets of an array question
// link - https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
public class O3_Subsets_ofAn_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the Array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        int limit = (int)Math.pow(2,arr.length);

        for (int i = 0; i <limit ; i++)
        {
            String set = "";
            int temp =i;
            // getting the binary equivalent of i so that if 0 comes we dont print and if 1 comes we print
            for (int j =arr.length-1; j >=0; j--) {
                int r = temp%2;
                temp=temp/2;
                // this above two lines is the code for converting a number into binary

                if(r==0)
                {
                    set = "-\t" + set;
                }
                else
                {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}
