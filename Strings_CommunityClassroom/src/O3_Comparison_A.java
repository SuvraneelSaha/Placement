public class O3_Comparison_A {
    public static void main(String[] args) {

        // 1st Method by using the == operator

        String a= "Kunal";
        String b= "Kunal";
        String c =a;

        System.out.println(a==c);

        // proof -- == operator

        System.out.println(a==b); // true



        // explicit declaration of strings
        String name1 = new String("Kunal");
        String name2 = new String("Kunal ");

        System.out.println(name1 == name2);
        // even though the value is the same the two reference variables are
        // pointing to different objects which are explicitly initialized
        // so it will give false


        // 2nd Method  by using the .equals method or function
        // now we only want to check the values

        System.out.println(name1.equals(name2));
        // the .equals method does not care about the ref variables are pointing to the same
        // object or not - it just cares about the value


    }
}
