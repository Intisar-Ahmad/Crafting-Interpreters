class Pen{
    String color;
    String type; // ballpoint, gel, fountain etc.


    public void write(){
        System.out.println("Writing something with " + this.color + " colored " + this.type + " pen.");
    }
}


class Student{
    String name;
    int age;
    char grade;


    // making a constructor
    Student(){ // default 
        System.out.println("constructor called");
    }


    // parameterized constructor
    Student(String name,int age, char grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    // copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.grade = s.grade;
    }

    public void study(){
        System.out.println(this.name + " is studying.");
    }

    public void printInfo(String name){ // change argument types or names for overloading
        System.out.println("Name: " + name);
    }

      public void printInfo(){// see? overloading
        System.out.println("Age: " + this.age);
    }
}

public class classesAndObjects {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";


        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen2.write();




        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.grade = 'A';

        s1.study();



        Student s2 = new Student("bhino",20,'A');
        s2.study();



        Student s3 = new Student(s2); // copy constructor
        s3.study();

        s3 = s2; // reference copy. what this means is that both s2 and s3 will point to the same object in the memory. changing one will change the other.
        s3.name = "Changed Name";
        s2.study(); // will print "Changed Name"


        // destructor is not there in java. Garbage collection on top boiii.
  
    
    }
}
