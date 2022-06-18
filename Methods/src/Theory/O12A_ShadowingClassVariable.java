package Theory;

public class O12A_ShadowingClassVariable {
   static int x = 100 ;
    public static void main(String[] args) {
        System.out.println(x);
        //1
        int x ;//declearation
     //   System.out.println(x);
        //scope will begin when the value is initialized
        // if the var is accessed in between the decleration and initialization then
        // it will give an error

        x=30;// initialization
        System.out.println(x);
    }
}
//2
// the scope begins when a variable is initialized
// not when it is declared
// Shadowing does not work for methods it works for variables only
