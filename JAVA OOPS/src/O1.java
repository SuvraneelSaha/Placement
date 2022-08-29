class Pen{
    // we can define a blueprint
    String colour;
    String type; // ballpoint , gel pen
    // these above are the properties Of Pen class

    // we can also define a method or functions
    // those functions which are defined inside of a class is known
    // as Methods

    public void write()
    {
        System.out.println("Hello World");
    }
    // this Pen class is the blueprint
    // we still havent made objects


    public void printColour()
    {
        System.out.println(this.colour);
        // this - keyword in java
        // whenever printcolour method is called upon by an object
        // it will printout the colour of the object as per the
        // functionality
        //
    }
}
public class O1 {
    // objects are made in the main function
    // main function resides in the public class
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        // this is how pen1 object is made which is of Pen class

        pen1.colour = "blue";
        pen1.type = "Dot";
        // now we have made an object pen1 of colour and tyoe blue and dot respectively

        // to call an objects function / method we have to use .

        pen1.write();
        // method call of the object
        // each and every objects have some methods and properties
        // properties - colur , type
        // methods - here ex - write
        // so these methods and properties are known
        // members and datas respectively
        // members - functions
        // data - variables that are stored

        Pen pen2 = new Pen();

        pen2.colour="Black";
        pen2.type = "Gel";

        pen1.printColour(); // pen1 object has called the printColour method
        pen2.printColour(); // pen2 object has called the ,,






    }

}
// in each and every file we need to make a public class
