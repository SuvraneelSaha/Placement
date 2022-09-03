import java.util.ArrayList;
import java.util.Scanner;

public class Question1_Mine {
    public static void main(String[] args) {
        //  {11,23,-3,3,-5,-32,45,2,-2,14};

        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the arr:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if(!(arr[i]<0))
            {
                list.add(arr[i]);
            }
        }

        System.out.println(list);

        if(list.size() % 2 ==0)
        {
            System.out.printf("Middle element will be the smaller index one %d",list.get((list.size()/2)-1) );

        }
        else
        {
            System.out.printf("Middle element will be the bigger index one %d",list.get((list.size()/2)) );
        }

    }
}
