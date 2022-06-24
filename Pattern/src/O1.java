public class O1 {
    public static void main(String[] args) {
        Pattern1(4);
    }
    public static void Pattern1(int n)
    {
        // 1st step - indentify the num of lines we are having and
        // run the outer for loop that number of times
        for (int row = 1; row <=n ; row++)
        {
            // for every row run the column
            for (int col = 1;col<=row;col++)
            {
                System.out.print("x");
            }
            // when a row is printed , we need to add a newline      
            System.out.println();

        }
    }
}
