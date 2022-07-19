package Theory_Pepcoding;

import java.util.Scanner;

public class O5_Parameters {
    public static void main(String[] args) {
        // 1
        // the question comes why do we need parameters as
        // we cannot take the i/p again and again from the user in the method defination
        // so we use the parameters
        // where we take the input from the main function and give it to the functions for
        // carrying out the instructions
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = in.nextLine();
        String ans = greet(name);
        System.out.println(ans);
    }
    //2
    static String greet(String name) // here is the parameters
            // and the parameters are always in order

    {
        String message = "Hello How are You " + name;
        return message;
    }
}
