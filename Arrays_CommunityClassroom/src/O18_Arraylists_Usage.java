import java.util.ArrayList;

public class O18_Arraylists_Usage {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // its good practice to write the data type
        // so that it signifies that what kind of arraylist it is
        // We cant pass here the primitive datatypes
        // we need to pass the wrapper classes

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // we can add as many items as possible
        // the initial capacity does not matter

        System.out.println(list);
        // and for printing we dont need the Arrays.toString or
        // any other means just like in the case of Arrays
        // we can simply print the Arraylist

        //CONTAINS FUNCTION
        System.out.println(list.contains(40)); // it will check whether the list contains this onject
        // or not
        // if the object is present then it will print true and if not then false

        // SET IE REPLACE FUNCTION
        list.set(0,99);
        System.out.println(list);

        // Remove an element according to the index

        list.remove(0);
        System.out.println(list);


    }
}
