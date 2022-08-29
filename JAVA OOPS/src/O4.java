public class O4
{
    // copy constructors
    // user defined constructors - in case of java
    // but in case of c++ - it is user defined and also auto
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        s1.name = "Wigga";
        s1.age = 22;

        s1.printInfo();
        Student3 s2 = new Student3(s1); // copy constructor - copying the s1 object into s2 object
        // we have directly assigned the s1 properties to the s2 object


        // if we have used copy constructor
        // we have to define this s1 constructor as well
        s2.printInfo();

    }
}
class Student3{
    int age;
    String name;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student3(Student3 s2)  // copy constructor
            // cause it is copying the contents of the s2 object and putting it
            // into a current object
    {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student3() // in case of copy constructors it is only valid to
            // create more than 1 constructor in a class
    {

    }


}

// the use of copy constructors is to copy an object and put it into another object

/*
in case of java there is no deconstructor as there is in c++
as in java there is garbage collection
which automatically removes redundant ie not necessary objects
from the memory
yamraj
 */