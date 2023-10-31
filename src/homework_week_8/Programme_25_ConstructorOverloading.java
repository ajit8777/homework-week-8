package homework_week_8;

/**
 * Example of Constructor Overloading
 * Java program showing overloading of constructors.
 */

public class Programme_25_ConstructorOverloading {
    // declare static method
    public static class Student5 {
        int id;
        String name;
        int age;

        //Creating two argument constructor.
        public Student5(int i, String n) {
            id = i;
            name = n;
        }

        //creating three argument constructor.
        public Student5(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        //creating instance method
        public void display() {
            System.out.println(id + " " + name + " " + age);
        }

        public static void main(String[] args) {
            Student5 s1 = new Student5(111, "Karan");
            Student5 s2 = new Student5(222, "Aryan", 25);
            s1.display();
            s2.display();
        }
    }
}
