public class O2_ArraySyntax {
    public static void main(String[] args) {

        int[] arr; // declaration of an Array

        // here this arr reference variable is getting defined in the Stack memory
        // now we need to point it to an object

        arr = new int[5]; // this is the initialization
        // actual memory creation happens here
        // object is being created in the heap memory
        // if you dont mention the size it will give an error ;

    }


}
