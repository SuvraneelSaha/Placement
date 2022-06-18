package Theory;

public class O11_ScopingInForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++)
        {
            System.out.println(i);
        }
       // System.out.println(i);
        // error we cannot access it outside the for loop
    }
}
/*
CONCLUSION :
ANYTHING THAT IS INITIALIZED OUTSIDE THE BLOCK CAN BE USED INSIDE THE BLOCK
AND ANYTHING THAT IS INITIALIZED INSIDE THE BLOCK CANNOT BE USED OUTSIDE THE BLOCK
SIMILARLY
ANYTHING THAT IS INITIALIZED OUTSIDE THE BLOCK CANNOT BE  INITIALIZED INSIDE THE BLOCK
AND ANYTHING THAT IS INITIALIZED INSIDE  THE BLOCK CAN BE INITIALIZED OUTSIDE THE BLOCK



 */