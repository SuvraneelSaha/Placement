package Theory_Pepcoding;

import java.util.Scanner;

public class O2_Sum_Syntax {
    public static void main(String[] args) {

        sum();
        //3
        // we call the function in the main function or method
        // and when calling a function we use brackets
        // we can call many times we want
        // we can modify the code in the method and all the function call
        // will be changed



        // 4
        // Return type :
        // the value of the function call is some kind of value
        // and that matches the return type of the function
        // the function will return a type of value and that same value will be present in the function call
        //
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the 1st num");
        int a = in.nextInt();
        System.out.println("please enter the 2nd num");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("the sum is " + sum);

    }
}
//1
    /*
       FUNCTION/METHOD SYNTAX:
    access modifer(we will learn that in oops) return type nameofthefunction()
    {
    // body of the code

    return statement;

     */
//2
/*

the static keyword - kind of the same analogy as the population of the humans
does not depends on a single object

and what is class - a class is something like a human class
all the humans have the same phenotypic features 2 eyes , 2 legs , 2 hands you get it

but an object in a class is like an individual in a class of humans
ex - kunal is an object in the human class
and static here means that - it does not depend on the object
ex - the population of the humans in this world does not depends on Kunal

The error message we are getting is that - it says
anything you want to use in static has to be in static
ex - static main method so we need to use static method when we are creating a method or a function


 */