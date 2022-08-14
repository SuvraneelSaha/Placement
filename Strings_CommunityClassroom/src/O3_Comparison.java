public class O3_Comparison {
    public static void main(String[] args) {
        // whenever we create a new class it starts with a capital letter -
        // its a convention
        String a = "Kunal";
        String b = "Kunal";
        // how can we check that two or more ref variables are pointing to the same object or different objects

        // we now know that now that both the objects are in string pool
        // as the value is same

        // but where is the proof

        // == operator ie comparison operator
        System.out.println(a==b);
        // why this warning is coming
        // follow notes then
        // cause in case of strings it acts differently
        

    }
}
