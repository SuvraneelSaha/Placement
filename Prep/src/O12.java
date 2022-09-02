import java.util.Scanner;

public class O12 {
    public static void main(String[] args) {
        // perfect numbers 
        // ie a number whose the sum of the factors is the number itself 
        Scanner in = new Scanner(System.in);
        
        int sum = 0 ;
        System.out.println("Please enter n :");
        int n = in.nextInt();

        for (int i = 1; i <=n/2 ; i++)
        {
            if(n%i==0)
            {
                sum = sum + i ;
            }
        }

        if(sum==n)
        {
            System.out.println("Perfect Number:");
        }
        else
        {
            System.out.println("not");
        }
        }
}
