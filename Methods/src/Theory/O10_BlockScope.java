package Theory;

public class O10_BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;

        {
            //2
         //   int a = 10 ; // already initialized outside the block in the same method hence we cannot initialize the value again
            // but we definitely can change the value



            //1

             a = 90;  // here we are reassign the og value of the ref var  to some other value


            // here it is saying a is already defined
            // Conclusion :
            // values initialized in the block, will remain useful in block
            // we cant change it or access it outside the block




            int c = 99;


        }
        //3
        System.out.println(a); // cannot use outside the block
        // error
        //

    }
}
