import java.util.Scanner;

public class O7_Input_ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        // for printing using normal for loop
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // using enhanced for loop
        for(int num : arr) // for every element in the array print the array
        {
            System.out.println(num + " "); // here num represents the element of the array
        }
    }
}
