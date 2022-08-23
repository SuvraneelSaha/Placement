import java.util.Scanner;
// Emirp number
public class O7 {
    static int Reverse(int n)
    {
        // 312 =--> 213
        int rev = 0 ;
        while (n!=0)
        {
            int rem = n%10;
            rev = rev*10 + rem;
            n=n/10;

        }
        return rev;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n = in.nextInt();

        if(isPrime(Reverse(n)) && isPrime(n))
        {
            System.out.println("Emirp Number");
        }
        else
        {
            System.out.println("Not");
        }


    }
    static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        int c = 2 ;
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
