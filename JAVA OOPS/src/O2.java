import java.lang.reflect.Constructor;

class Student
{
    // class keyword is necessary before the class name
    // classes name should be starting with Capital letters
    // whereas the methods name starts with small letters

    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name +" " + this.age);
    }

//    Student()  // it is a constructor - it has no return type
//            // it is of non parameterized Constructor
//    {
//        System.out.println("Constructor Called ");
//    }
    Student(String name,int age)
    {
        this.name = name ;
        this.age = age;

    }

}

public class O2 {
    public static void main(String[] args) {
        Student s1 = new Student("Aman",29);
        // new is a keyword -
        // in heap memory - a memory is created inside the heap memory for  an object is created ie s1 object is created inside the
        // heap memory by using the new keyword
        // and the object will reside in the heap memory - hoe principle

        // and the Student() is the constructor here
        // it is also a function , a special type of function
        // Constructors helps in constructing or creating objects in java

        // Important points regarding Constructors :
        // 1] the Constructor will have the same name as the class
        // ex - student class - therefore the Constructor's name will be student
        // 2] Constructors does not return anyting
        // constructors are methods only, but they do not have a return type
        // no return type - int , string , void nothing no return type
        // only work of Constructors is to construct the objects
        // 3] or a single object  only once the Constructor can be called
        // in case of normal functions we call call it many times in psvm
        // but in case of constructors we call call it only once - when we need to construct an object



        // there are 3 types of constructors
        // 1] non parameterized constructors -- no parameters
        // 2] Parameterized Constructor - 03.java
        // 3] Copy constructors

        s1.name = "Wigga";
        s1.age = 22;

        s1.printInfo();


    }
}

/*
in java - when we manually write a non parameterized constructor it will call that constructor
otherwise by default it calls a constructor
if we make our own then it will call ours otherwise default
 */