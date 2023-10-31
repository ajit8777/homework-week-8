package homework_week_8.programme_24_method_overriding;

/**
 * create class name with SBI and extends by parent class Bank
 */
public class SBI extends Bank {
    public int getRateOfInterest() {  //overrides method in Bank
        return 8;
    }
}
