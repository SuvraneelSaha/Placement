package Theory;

public class O9_Scope {
    public static void main(String[] args) {
        int a = 10;
        int b=20;

        //2
        // System.out.println(num);
        // here in the main func we cannot access the var and objects that are present in the other functions
        // it will give error
    }
    static void random()
    {
        //1
       // System.out.println(a);
        // it will give me an error as this function does not know that a variable a is present
        // in the main function
        int num = 67 ;


    }
}
// 3
// so this is known as the function scope
// CONCLUSION
// if we define any variables inside the function  we can only access those within that function
// it  also holds true for parameters
// in case of primitive data type the value will be passed and if we try to modify it -- it wont change
// and in case of non primitive data type the copy of the value of the reference variable will be passed
// and if we try to modify it -- it will change
// the reason is one is pass by value and another one is pass by the copy of the value of the  reference variable

