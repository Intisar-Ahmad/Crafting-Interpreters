// package java_practice;



public class variables {
    public static void main(String[] args) {
        // Variable declaration and initialization
        String name = "bhino"; // string
        int age = 16; // integer
        double height = 5.9; // double (twice as float) for decimal numbers
        char grade = 'A'; // character
        boolean isStudent = true; // boolean
        float weight = 150.5f; // float for decimal numbers
        long phoneNumber = 1234567890L; // longer integer

        System.out.printf("My name is %s, I am %d years old, I am %.1f feet tall, my grade is %c, and I am a student: %b. My weight is %.1f lbs and my phone number is %d%n",name,age,height,grade,isStudent,weight,phoneNumber);
        
        // types
        // primitive types

        // 1. byte - 8 bits
        byte b = 100;
        System.out.println("Byte value: " + b);
        // 2. short - 16 bits
        short s = 10000;
        System.out.println(s);

        // 3. int - 32 bits
        // 4. long - 64 bits
        // 5. float - 32 bits
        // 6. double - 64 bits
        // 7. char - 16 bits
        // 8. boolean - 8 bits - fun fact: 7 bits are wasted. cuz its only 1 or 0
        


        // non-primitive types
        // 1. String
        // 2. Arrays
        // 3. Classes - more on that later

        // constants

        final double PI = 3.14159; // the capital letters is a convention
        System.out.println("You can't change me bro: " + PI);

    }
}
