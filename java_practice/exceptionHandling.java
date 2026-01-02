public class exceptionHandling {
    public static void main(String[] args) {
        // try-catch-finally blocks are used for exception handling in Java

        try {
            // code that may throw an exception
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // handle the exception
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            // code that will always execute
            System.out.println("This block always executes.");
        }

        // You can have multiple catch blocks for different exceptions
        try {
            // String str = null;
            // System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e.getMessage());
        }
    }
}
