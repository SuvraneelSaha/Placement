import java.util.Scanner;

public class O14 {
    public static void main(String[] args) {
        // prime numbers along with composite numbers  with various test cases

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the no. of test cases ");
        int t = in.nextInt(); // 3
        for (int i = 0; i < 3; i++)
        {


            System.out.println("Please enter the number : ");
            int n = in.nextInt();


            if (isPrime(n) == true) {
                System.out.println("Prime");
            } else {
                if (isComposite(n)) {
                    System.out.println("Composite");
                } else {
                    System.out.println();
                }

            }
        }

    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false ;
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
        return true;

    }
    static boolean  isComposite(int n)
    {
        int count = 0 ;
        for (int i = 1; i <=n ; i++)
        {
            if(n%i==0)
            {
                count ++ ;
            }
        }

        if(count > 2 ) // as in composite numbers the number of factors is always more than two
            // but in the case of prime numbers the number of factors is 2
            // 1 and the number itself
        {
             return true;
        }
        else
        {
            return false;
        }
    }
}
