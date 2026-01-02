public class casting {
    public static void main(String[] args) {
        // casting 


        // implicit casting(smaller to larger)
        int something = 14;
        double something2 = something;
        System.out.println(something2);

        // explicit casting(larger to smaller)
        
        double p1 = 10.88;
        // int p = p1; // error
        int p = (int)p1; // explicitly cast double to int. may lose some data
        System.out.println(p);



    }
}
