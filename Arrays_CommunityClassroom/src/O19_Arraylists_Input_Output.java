import java.util.ArrayList;
import java.util.Scanner;

public class O19_Arraylists_Input_Output {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

        // for taking input
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
        }

        // for output

        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
            // we need to pass the index in the .get function otherwise it wont work

            // list[index] syntax will not work here
        }

    }
}
