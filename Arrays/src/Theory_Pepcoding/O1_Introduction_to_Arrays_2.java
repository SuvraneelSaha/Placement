package Theory_Pepcoding;
// how to declare array
// how to allocate space
// how to assign values
// how to print length of an array
// how to print values of an array

public class O1_Introduction_to_Arrays_2 {
    public static void main(String[] args) {
        // store marks of students
        // say 3 students  -- so 3 variables
        // now 5 students
        // now 100 students
        // so we use arrays to store datas
        //int[] marks -- array of integers
        // ie full syntax --> int[] marks = new int[5] ;
        // for 5 students
        // how to access marks of the students
        // marks[0] - 1st student
        // marks[1] - 2nd student
        // .....
        // marks [4] - 5th student
        // so ex -
        int[] marks = {51,31,66,32,55};
        // for printing the marks of 5 students :
        // we use for loop
        for (int i = 0; i <marks.length ; i++)
        {
            System.out.println(marks[i]);
        }

        // this below is array decleration
        int[] arr ; // declaration

        arr = new int[5]; // initialization

        // the declaration & initialization  can be written in a single line
        // ex
        int[] cars = new int[5];
        // example
        System.out.println("New line for new printing ");
        arr[0] = 33;
        arr[1] = 43;
        arr[2] = 53;
        arr[3] = 63;
        arr[4] = 73;

//        System.out.println(arr.length);
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
