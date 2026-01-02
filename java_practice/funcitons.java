public class funcitons {

    public static void print(String message){
        System.out.println(message);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        // lets make a function that adds two numbers

        int sum = add(5,10);

        // also i am tired of writing sysout. lets make a print function too
        print(sum + "");
        // pretty chill
    }
}
