public class O6 {
    public static void main(String[] args) {
        Pattern7(5);
    }
    static void Pattern7(int n)
    {
        // STEP 1 :
        for (int row = 0;row< 2 * n ;row++) // the number of loops = 2 * n - 1
            // here < sign is present so no need to write 2*n-1 instead we can write -- < 2*n
        {
            // Step 2 : Find the relation between the number of columns and rows for each particular row
            int c = row > n ? n-(row - n ) : row;

            int spaces = n-c;

            for(int s = 0;s<spaces;s++)
            {
                System.out.print(" ");
            }

            // for printing stars ; same as previous one
            for (int col = 0;col<c;col++)
            {
                System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}

/*
    as we have already made the relation between the rows and columns for each rows
    so we can simply implement the number of spaces according to c ( which is the total number of columns in a particular row)

 */