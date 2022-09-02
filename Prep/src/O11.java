import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        // print all the numbers which are divisible by 5 or 7
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter n :");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if(i%5==0 || i%7==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
