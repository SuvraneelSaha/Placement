public class O2 {
    public static void main(String[] args)
    {
        Pattern6(5);
    }
    static void Pattern6(int n)
    {
        // STEP 1
        // according to he template - we use < n
        // we need to find the actual number of rows
        for (int row = 0;row<2*n;row++)
        {
            // Step 2 : Find the relation between the number of columns and rows for each particular row
            int c = row > n ? n-(row - n ) : row;
            for (int col = 0;col<c;col++)
            {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
