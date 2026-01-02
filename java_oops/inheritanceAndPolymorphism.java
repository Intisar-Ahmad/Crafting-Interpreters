class Shape{
    String color;

}

class Triangle extends Shape{
    int height;
    int base;


}



public class inheritanceAndPolymorphism {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.height = 10;
        t1.base = 5;
        t1.color = "Red";

        System.out.println("Height: " + t1.height);
        System.out.println("Base: " + t1.base);
        System.out.println("Color: " + t1.color);
    }
}

// // Single Inheritance
// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }

// // Multilevel Inheritance
// class Vehicle {
//     void drive() {
//         System.out.println("Vehicle is driving");
//     }
// }

// class Car extends Vehicle {
//     void honk() {
//         System.out.println("Car is honking");
//     }
// }

// class ElectricCar extends Car {
//     void charge() {
//         System.out.println("Electric car is charging");
//     }
// }

// // Hierarchical Inheritance
// class Shape {
//     void display() {
//         System.out.println("This is a shape");
//     }
// }

// class Circle extends Shape {
//     void area() {
//         System.out.println("Circle area calculation");
//     }
// }

// class Rectangle extends Shape {
//     void area() {
//         System.out.println("Rectangle area calculation");
//     }
// }

// // Polymorphism - Method Overriding
// class Animal2 {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Cat extends Animal2 {
//     @Override
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// class Bird extends Animal2 {
//     @Override
//     void sound() {
//         System.out.println("Bird chirps");
//     }
// }

// // Polymorphism - Method Overloading
// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// class Demo {
//     public static void main(String[] args) {
//         // Single Inheritance
//         Dog dog = new Dog();
//         dog.eat();
//         dog.bark();

//         // Multilevel Inheritance
//         ElectricCar eCar = new ElectricCar();
//         eCar.drive();
//         eCar.honk();
//         eCar.charge();

//         // Polymorphism - Method Overriding
//         Animal2 cat = new Cat();
//         Animal2 bird = new Bird();
//         cat.sound();
//         bird.sound();

//         // Polymorphism - Method Overloading
//         Calculator calc = new Calculator();
//         System.out.println("Sum: " + calc.add(5, 10));
//         System.out.println("Sum: " + calc.add(5.5, 10.5));
//         System.out.println("Sum: " + calc.add(5, 10, 15));
//     }
// }