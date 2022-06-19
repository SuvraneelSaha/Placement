package Theory;

import java.lang.reflect.Array;
import java.util.Arrays;

public class o16_MethodOverLoadingAndVarArgs {
    public static void main(String[] args) {
        demo(123,321,13);
        demo("kunal","nigga","rahul");


     //O   demo();
        // ambiguity -- error
        // cause the compiler will get confused to run which method
        // parameters not present

    }
    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
// in Intellij if there is any error in any of the file in will not execute
//

// Method overloading + VarArgs