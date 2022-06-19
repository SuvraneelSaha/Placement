package Theory;

public class O15_FunctionOverloading {
    public static void main(String[] args) {

        fun(1);
    }
    static void fun(int num1)
    {
        System.out.println(num1);
    }

    static void fun(int num1,int num2)
    {

    }
}
//1
// when two or more functions have the same name
// then these two or more functions are differentiated by the parameters present in th function
// return type does not matter


//2
// Method overloading happens at compile time or compilation time
// so at compile time it decides which function to run

// and function or method overriding works at runtime
// we will learn this in oops


// 3
// METHOD OVERLOADING WORKS IN TWO WAYS :
// 1] BY TAKING DIFFERENT NUMBER OF PARAMETERS IN THE FUNCTION
// 2] OR BY TAKING DIFFERENT TYPE OF PARAMETERS IN THE FUNCTION
