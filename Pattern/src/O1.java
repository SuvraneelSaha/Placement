public class O1 {
    public static void main(String[] args) {
        Pattern5(5);
    }

    public static void Pattern1(int n) {
        // 1st step - indentify the num of lines we are having and
        // run the outer for loop that number of times
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <= row; col++) {
                System.out.print("x");
            }
            // when a row is printed , we need to add a newline      
            System.out.println();

        }
    }
    public static void Pattern2(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            // for every row run the column
            for (int col = 1;col<=n;col++)
            {
                System.out.print("x ");
            }
            // when a row is printed , we need to add a newline
            System.out.println();
        }
    }
    public static void Pattern3(int n)
    {
        for (int row = n; row >=1 ; row--)
        {
            // for every row run the column
            for (int col = 1;col<=row;col++)
            {
                System.out.print("* ");
            }
            // when a row is printed , we need to add a newline
            System.out.println();
        }
    }
    // pattern 4 and pattern 3 are same but different approach
    public static void Pattern4(int n)
    {
        for (int row = 0; row <n ; row++)
        {
            // for every row run the column
            for (int col = 1;col<=n-row;col++)
            {
                System.out.print("* ");
            }
            // when a row is printed , we need to add a newline
            System.out.println();
        }
    }
    public static void Pattern5(int n)
    {
        for (int row = 1; row <=n ; row++)
        {
            // for every row run the column
            for (int col = 1;col<=row;col++)
            {
                System.out.print(col +" ");
            }
            // when a row is printed , we need to add a newline
            System.out.println();
        }
    }


}
