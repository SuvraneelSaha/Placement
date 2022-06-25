public class O9 {
    public static void main(String[] args) {
        Pattern9(4);
    }
    static void Pattern9(int n)
    {
        // STEP 1 : find out the number of rows
        for (int row = 1; row <=2*n-1 ; row++)
        {
            // Find out the number of columns in each row
            for (int col = 1; col <=2*n-1 ; col++)
            {
                
                System.out.println(col + " ");
            }
            System.out.println();
        }
    }
}
