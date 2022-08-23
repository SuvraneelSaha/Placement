import java.util.Scanner;

public class O10 {
    public static void main(String[] args) {
        powerCalculate();
    }
    static void powerCalculate()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X ");
        int x = in.nextInt();
        System.out.println("Enter Y ");
        int y = in.nextInt();

        int res = (int)Math.pow(x,y);
        System.out.println("the Result = "+res);
    }
}
