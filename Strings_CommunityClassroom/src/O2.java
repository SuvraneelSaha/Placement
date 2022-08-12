public class O2 {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        //System.out.println(name);
        String a = "Kunal";
        //String b = "Kunal";
        // here a and b are pointing to one object only

        System.out.println(a);

        a = "Kushwaha";
        System.out.println(a);
        // it may come as a doubt that -- the string objects cannot be changed
        // then how are we changing the value of the a ref var from kunal to kushwaha
        // take a look at it very carefully
        // we are not changing this object
        // we are creating a new object ;
        // cause this may be very confusing





        // why is that strings are immutable - the short ans is for security reasons
        /*
        for optimization point of view we know there is string pool which is a separate
        storage in the heap memory for the strings only
        where many ref var can point to the same object

         */
    }
}
