import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your height: ");
        float height = scanner.nextFloat();
        System.out.println(name + age + height);
        scanner.close();

    }
}
