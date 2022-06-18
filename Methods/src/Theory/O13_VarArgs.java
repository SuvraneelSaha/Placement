package Theory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class O13_VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,66,77,88,99);
        // we can pass any number of arguments to the method
        // in case of variable length arguments

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));

    }
}
// varargs - when we dont know how many inputs we are giving to the method
//2
//SYNTAX -
// (data type ...(any name or alphabet)) --> it should be inside the parameters of the function
// the parameters in case of varargs are implicitly declared as an array of the data type which is specified
//