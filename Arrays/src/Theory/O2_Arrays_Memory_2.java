package Theory;
// Implication of Array --> shallow copy
public class O2_Arrays_Memory_2 {
    public static void main(String[] args) {
        int[] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;

        int[] two = one ;
        two[1] = 200 ;

        for (int i = 0; i < one.length ; i++)
        {
            System.out.println(one[i]);
        }
        System.out.println("New Array Printing");
        for (int i = 0; i < two.length ; i++)
        {
            System.out.println(two[i]);
        }

    }
}
