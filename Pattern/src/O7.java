public class O7 {
    public static void main(String[] args) {
        Pattern7(5);
    }

     static void Pattern7(int n)
     {
         // STEP 1 : finding out the number of rows
         for (int row = 1; row <=n ; row++)
         {
             // for spaces : spaces working according with the n and the row number
             // number of spaces = n - row number
             int spaces = n-row;
             for(int s = 1;s<=spaces;s++)
             {
                 System.out.print("  ");
             }
             // Step 2 : find the reltn. between the rows and columns for each particular row
            for (int col = row;col>=1;col--)
            // this for loop is printing from that particular row to 1
            {
                System.out.print(col +" ");
            }
             for (int col = 2; col <=row ; col++)
             // this for loop is printing from 2 to that particular row number
             {
                 System.out.print(col + " ");
             }
             System.out.println();
         }
    }
}
//
