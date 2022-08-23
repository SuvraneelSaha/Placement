import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int num1 = in.nextInt();
        System.out.printf("the number %d is  : %d",num1,Factorial(num1));
        System.out.println();
        System.out.println("Please enter the 2nd number");
        int num2 = in.nextInt();
        System.out.printf("the number %d is  : %d",num2,Factorial(num2));
        System.out.println();
        System.out.println("Please enter the 3rd number");
        int num3 = in.nextInt();
        System.out.printf("the number %d is  : %d",num3,Factorial(num3));
        System.out.println();
    }
    static int Factorial(int n)
    {
        if(n==0)
        {
            return 1 ;
        }

        if(n<0)
        {
            return -1;
        }
        int product = 1 ;
        for (int i = 1; i <=n ; i++)
        {
                product = product * i;
        }
        return product;
    }
}
