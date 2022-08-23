import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num1 = in.nextInt();
        System.out.println(isKrishnamurtiNumber(num1));

    }
    static boolean isKrishnamurtiNumber(int n)
    {
        int temp = n;
        int sum = 0 ;
        while (n!=0)
        {
            int rem = n%10;
            sum = sum + Factorial(rem);
            n=n/10;

        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int Factorial(int n)
    {

        int product = 1;
        for (int i = 1; i <=n ; i++)
        {
            product = product * i;

        }
        return product;

    }
}
