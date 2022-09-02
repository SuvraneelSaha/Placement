import java.util.ArrayList;
import java.util.Scanner;

public class Del_Duplicate_Using_Arraylists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the 1St array : ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        for (i = 0; i < arr1.length -1 ; i++)
        {
            if(arr1[i] != arr1[i+1])
            {
                list.add(arr1[i]);
            }

        }
        list.add(arr1[i]);
        System.out.println(list);

        for (int j = 0; j < list.size() ; j++)
        {
            System.out.print(list.get(j) + " ");
        }


    }
}
