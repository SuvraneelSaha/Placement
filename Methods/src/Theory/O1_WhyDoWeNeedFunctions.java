package Theory;

import java.util.Scanner;

public class O1_WhyDoWeNeedFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num");
        int a = in.nextInt();
        System.out.println("please enter the 2nd num");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("the sum is " + sum);

        // this is a normal program of entering two numbers
        // taking input and printing their sum

        // Now the Question Comes
        // Why do we need Functions ?
        // say the above program needs to be done 100 times
        // will you copy the code for 100 times
        // it will be very inefficient and time consuming
        //
        //
        // so as an ans to that , we see a block of code that is REUSABLE and can be MODIFIED  without changing all the codes ex -
        // 100 codes one at a time


        // FYI - in case of java , functions present in classes are known as methods .
        // DRY - In programming - Dont Repeat Yourself .

    }
}
