package homework_week_8.programme_24_method_overriding;

/**
 * create class name with ICICI and extends by parent class Bank
 */
public class ICICI extends Bank {
    public int getRateOfInterest() { //overrides method in Bank
        return 7;
    }
}
