package Theory_Pepcoding;
// how array is stored in memory
// Learn this in detail from kunal's array notes
public class O1_Introduction_to_Arrays_3 {
    public static void main(String[] args) {
/*
memory has two parts - one is stack and another one is heap

int[] arr ;
// when we declare this the arr will be put into stack memory will null

// and when we initialize
// arr = new int[5]
// 5 memory spaces are created in the heap memory
// ex - 4000 then 4004 , 4008,4012


then the address of the 1st element of that array will be stored in the stack memory
only the 1st element


for example - for the primitive data types
their values are directly in the stack memory

int i = 0 ;
primtive -- are stored in the stack memory

but in case of non - primitive data types - only the names of that data type is stored in the stack
and the storage of those objects are stored in the heap memory
and in stack their address of the 1st element is being stored
// example
int[] arr = {11,12,13,14,15}
the arr will be stored in the stack memory along with the value of the address of the 1st element ie 11
// and the other values ie objects of the array arr will be stored in the heap memory

// storage happens in this way below given :
// arr[0] = 10 ---> 4000[0] = 10 ;
// arr[3] = 40 --> 4000[3] = 40 ie at 4012
cause each int = 4 byte




  */
    }
}
