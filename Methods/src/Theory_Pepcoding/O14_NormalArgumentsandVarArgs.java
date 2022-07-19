package Theory_Pepcoding;

public class O14_NormalArgumentsandVarArgs {
    public static void main(String[] args) {
        multiple(11,12,33,34,55,66);

    }
    static void multiple(int a,int b , int ...v)
    {
        // the order must not change
        // and it should be maintained
        // Variable length arguments must be the last in the last
        // cause how we will know where the parameters will end or not
        // in case of varArgs
        // so VarArgs should always come at the end

    }
}
