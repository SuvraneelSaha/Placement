package Theory;

import java.util.Scanner;

public class O6_SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the nums");
        int a = in.nextInt();
        int b = in.nextInt();

        // code for swapping
//        int temp = a ;
//        a=b;
//        b=temp ;

        swap(a,b);

        System.out.println(a + " " + b );
        // 1
        // idk why it is not working
        // ie actually why is it not swapping the two places
        // we will see it in the next one



    }
    static void swap(int a , int b)
    {
        int temp = a ;
        a=b;
        b=temp;

    }
}
