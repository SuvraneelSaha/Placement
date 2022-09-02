import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class O13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the 1St array : ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter the elements : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Please enter the size of the 2nd array : ");
        int m = in.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter the elements : ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int i;
        for (i = 0; i < arr1.length -1 ; i++)  // 3 1 1 2
        {
                if(arr1[i] != arr1[i+1])
                {
                    list1.add(arr1[i]);
                }

        }

        list1.add(arr1[i]);

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int j;
        for (j = 0; j < arr2.length -1 ; j++)
        {
            if(arr2[j] != arr2[j+1])
            {
                list2.add(arr2[j]);
            }

        }
        list2.add(arr2[j]);

        System.out.println(list2);

        for (int k = 0; k < list2.size(); k++)
        {
            list1.add(list2.get(k));
        }

        System.out.println(list1 );

        Collections.sort(list1);

        if(list1.size() % 2 != 0)
        {
            System.out.println("MEDIAN");
            System.out.println(list1.get(list1.size()/2));
        }
        else
        {
            System.out.println(list1.get(list1.size()/2) + " " + list1.get((list1.size()/2)+1));
        }









    }
}
