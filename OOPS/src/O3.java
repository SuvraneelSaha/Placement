import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bank obj1 = new Bank();


        System.out.println("Please enter the account number ");
        obj1.acc = in.nextInt();

        System.out.println("Please enter your name :");
        obj1.name = in.next();

        System.out.println();

        System.out.println("Please enter your Bal");
        obj1.balance = in.nextInt();


        obj1.Greeting();


    }
}

class Bank
{
    int acc;

    String name ;

    int balance;


    void Greeting()
    {
        System.out.println("Hello "+name);

    }
}
