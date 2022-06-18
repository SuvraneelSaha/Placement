package Theory;

public class O13A_VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);

    }
    static void fun(int ...v)
    {
        int sum =0 ;
        for (int i = 0; i < v.length ; i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
// needs to search the topic of how to add or take a sum for a varArgs method
