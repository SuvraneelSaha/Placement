package Theory_Pepcoding;

import java.util.Scanner;

public class O3_Sum {
    public static void main(String[] args) {
           int ans = sum2();
        System.out.println(ans);
        //1
        // what happens here is that
        // the sum which is being returned from the sum2 function will be stored
        // in the reference variable ans
        // then we can use it as per our means
        // here we are printing it out
    }
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num");
        int a = in.nextInt();
        System.out.println("please enter the 2nd num");
        int b = in.nextInt();
        int sum = a + b;
        return sum;
        //2
        // after return statement any statement which is below it wont run
        // return means the function will end
        // like rahul gandhi meme tata khatam
        // if any statment or instructions are present then it will be an unreachable statement


        //3
        // if we have specifed a return type then we need to return the same data type
        // or else it will show error
    }
}
