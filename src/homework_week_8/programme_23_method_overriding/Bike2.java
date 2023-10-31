package homework_week_8.programme_23_method_overriding;

/**
 * create class name with Bike2 and extends by parent class Vehicle
 */
public class Bike2 extends Vehicle {
    //method overridden
    public void run() {
        System.out.println("Bike is running safely");
    }

    // declare main method and called instance method by creating object
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
