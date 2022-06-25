public class O8 {
    public static void main(String[] args) {
        Pattern8(5);
    }
    static void Pattern8(int n)
    {
        // Step 1 : find out the number of rows
        for (int row = 1; row <=2*n ; row++)
        {
            int c = row > n ? 2*n-row   /*n-(row-n)*/  : row;
            // for finding the number of spaces for each row

            for (int s = 1; s <=n-c ; s++)
            {
                System.out.print("  ");
            }
            // this is printing from the row number to 1
            for (int col = c; col >=1 ; col--)
            {
                System.out.print(col + " ");
            }
            // this is printing from 2 to row number
            for (int col = 2; col <= c; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
