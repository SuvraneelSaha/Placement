public class O5_Null_Keyword {
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(arr[0]);

        String str = null; // no error

        // but

        // int a = null ; // error
    }
}
// null - the default data that is present in an String array
// it is a literal

// we can cast it to any particular reference type or variable
// but we cant create a null type
// ex - null a = null ; -- error
// which means it is not a datatype

// we can use it with string ie with  non primitive data types
// but not with primitive data types - ie int , boolean

// any reference variable that we have is going to have by default null type
// ex - when declaration the value of the reference variable is null
// int[] arr ; // arr 's value is null

/*
In short Null - it is special value which is the by default value of reference variables

it's not an object or any particular value  which can be assigned to any reference type
 and you can typecast null to any type as well but not for primitive data types

 */