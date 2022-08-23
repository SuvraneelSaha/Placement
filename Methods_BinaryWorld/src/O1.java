import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int num1 = in.nextInt();
        System.out.printf("the number %d is Prime : %s",num1,isPrime(num1));
        System.out.println();
        System.out.println("Please enter the 2nd number");
        int num2 = in.nextInt();
        System.out.printf("the number %d is Prime : %s",num2,isPrime(num2));
        System.out.println();
        System.out.println("Please enter the 3rd number");
        int num3 = in.nextInt();
        System.out.printf("the number %d is Prime : %s",num3,isPrime(num3));
        System.out.println();



    }
    static boolean isPrime(int n)
    {
        if(n<=1)
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
        if(c*c>=n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}
