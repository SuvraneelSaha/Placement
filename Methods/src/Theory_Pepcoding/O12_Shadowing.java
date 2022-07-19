package Theory_Pepcoding;

public class O12_Shadowing {
    static int x=90; // this will be shadowed by var x which is in the main method
    // cause lower level is overriding the upper level
    //1
    // this means that the variable x is going to be available to everything inside the block of x or to the entire class
    // just as if we define an int var a inside the main function it will be available in the whole main function
    // or block or code
    public static void main(String[] args) {
        System.out.println(x);
        int x = 60; // the class var is shadowed by this
        System.out.println(x);



        fum();

    }
    static void fum()
    {
        System.out.println(x);
    }
}
//2
// static is object independent
// and we cannot use object independent things inside the object dependent things and vice versa


//3
// shadowing - it is a practice of using 2 variables with the same name within the scope that overlaps