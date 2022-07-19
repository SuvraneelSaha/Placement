package Theory_Pepcoding;

import java.util.Scanner;

public class O17_PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the num");
        int n = in.nextInt();
        System.out.println(isPrime(n));



    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c =2 ;
        while (c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c>n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
