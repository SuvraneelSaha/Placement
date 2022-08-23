import java.util.Scanner;

public class O3 {
    // sum of the factorials
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int num1 = in.nextInt();
        Factorial(num1);
        System.out.println("Please enter the 2nd number");
        int num2 = in.nextInt();
        Factorial(num2);
        System.out.println("Please enter the 3rd number");
        int num3 = in.nextInt();
       Factorial(num3);

    }
    static void Factorial(int n)
    {
        if(n==0)
        {
            System.out.printf("The sum of the Factorials of %d is %d",n,1);
        }


        if(n<0) // as it is not valid
        {
            System.out.printf("The sum of the Factorials of %d is %d",n,-1);
        }
        int product = 1,sum = 0; ;
        for (int i = 1; i <=n ; i++)
        {
            product = product * i;
            sum = sum + product;
        }
        System.out.printf("The sum of the Factorials of %d is %d",n,sum);

    }
}
