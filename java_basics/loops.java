public class loops {
    public static void main(String[] args) {
        // loops are pretty same too

        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }


        // while loop
        int j = 0;
        while(j < 5){
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // do while loop. this will run at least once
        int k = 0;
        do{
            System.out.println("Do while loop iteration: " + k);
            k++;
        }while(k < 5);


        // break and continue statements work the same way too
        // loops can be nested too
    }
}
