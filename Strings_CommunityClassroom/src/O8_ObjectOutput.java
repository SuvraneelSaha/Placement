import java.util.Arrays;

public class O8_ObjectOutput {
    public static void main(String[] args) {
        System.out.println(new int[]{1,2,3,4,5});

        /*
        here it is saying that print an object

        java is now confused as objects is of many times -- array , hash maps , self made objects

        its output is -- some random value

        steps :
        1] it will first call the .value method
        2] then it will call .toString


        so to resolve we use function overriding




         */


        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,}));
        // this above is known as function overriding
        // as it is telling the java explicitly to use Arrays.toString function or method
        // function has been overridden from using the default println to printing the array
        // by using the Arrays.toString method

    }
}
