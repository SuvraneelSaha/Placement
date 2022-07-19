package Theory_Pepcoding;

import java.util.Scanner;

public class O18_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the num");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));



    }
    static boolean isArmstrong(int n)
    {
        int original = n ;
        int sum =0 ;
        while (n>0)
        {
            int rem = n%10;
            sum += rem*rem*rem;
            n=n/10;
        }
        if(sum==original)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
