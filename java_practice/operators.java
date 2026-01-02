public class operators {
    public static void main(String[] args) {
        // arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b)); // 13
        System.out.println("Subtraction: " + (a - b)); // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b)); // 3
        System.out.println("Modulus: " + (a % b)); // 1

        // increment and decrement
        a++; // a = a + 1
        System.out.println("Incremented a: " + a); // 11
        b--; // b = b - 1
        System.out.println("Decremented b: " + b); // 2

        // comparison operators
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x)); // false

    }
}
