import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        sumofDigits();
        System.err.println();
        System.err.println();
        sumofDigits();
    }
    static void sumofDigits()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n = in.nextInt();
        int sum = 0 ;
        while (n!=0)
        {
            int rem = n%10;
            sum = sum+rem;
            n=n/10;
        }
        System.out.printf("the sum of the digits of %d is %d",n,sum);


    }
}
