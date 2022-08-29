class Student1{
    String name;
    int age;

    public void printDetails()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student1(String name , int age)
    {
        // in case of parameterized Constructors we
        // can initialize the values by ourselves

        this.name = name;
        this.age = age;
        // this.name is the objects's name and the name on the rhs is the parameter passed
        // in the constructor
        // same for the age


    }


}

public class O3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Aman",28);
        s1.printDetails();

        Student1 s2 = new Student1("Nigga",22);
        s2.printDetails();

        Student1 s3 = new Student1("Wigga",20);

        s3.printDetails();
        s3.age = 21;
        s3.name = "Aigga";

        s3.printDetails();

    }
}

/*
in case of parameterized constructors we passed the parameters
and it assigned it into the object

and finally we printed the Details using the Function present in the class

 */