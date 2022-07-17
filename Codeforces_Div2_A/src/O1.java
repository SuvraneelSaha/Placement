import java.util.Scanner;
// 466 ms Accepted
public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>2)
        {

            if(n%2==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
}
