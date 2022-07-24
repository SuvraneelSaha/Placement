public class O1_Intro {
    /*
    the first question that comes into the mind
    why we need arrays ?
    the simple answer is to reduce spaces and manual work
    ex - we need to store 5 roll numbers
    -- then intuitively we can just assign 5 variables and put the value in them
    but the problem comes when the given number is large
    say for example we need to store 5000 roll numbers
    is it possible to store 5000 roll numbers manually by assigning
    each roll number to a variable
    noops its not possibly
    and its against the principle of DRY - Dont Repeat Yourself

    so here comes the solution we use Arrays

     */

    // Arrays Syntax
    // Datatype[] Array_Name = new Datatype[size of the Array];

    // what this syntax means -
    /*
    the datatype signifies what kind of data that is present in the Array
    ArrayName - Could be anything upto the user's choice
    ex - naming a kid - elon musk named his kid X-A1 like that or something

    new keyword -

    Size of the Array - number of elements that will be stored in the Array
    ex - 5 10 ....




     */

    /*
    // Can we store different types of data in an Array - short answer NO

    Datatype[] Array_Name = new Datatype[size of the Array];
    this data type should be maintained
    no changing of the datatype is allowed

    like we can store 5 numbers in an int[] array
    but we cant store 3 numbers 2 float numbers , 2 names in an array





     */
    // Example

    int[] rollnumbers = new int[5];

    /*
    this means

    rollnumebers this reference variable is pointing to an array object of size 5 that contains
    elements of type integer



     */
 }
