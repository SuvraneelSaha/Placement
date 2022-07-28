import java.util.ArrayList;
import java.util.Scanner;

public class O20_MultiDimension_ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // firstly we need to initialize the number of Arraylists that will be
        // present inside the Main Arraylist

        // Analogy

        // its like the rows that are the main part of a 2D matrix
        // and the columns are dependent on the rows

        // here each rows is the individual Arraylists

        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>());

        }

        // adding elements in the row
        // ie in the Arraylists which is present inside the main Arraylist

            for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(col,in.nextInt());
            }
        }

        // printing the Arraylist
        System.out.println(list);
    }
}
