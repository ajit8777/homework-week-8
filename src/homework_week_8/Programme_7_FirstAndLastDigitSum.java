package homework_week_8;

/**
 * First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 */
public class Programme_7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        // calling static method into main method with parameter
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    //declare static method
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) { //if statement
            return -1;
        }
        int lastDigit = number % 10;
        // declare while loop
        while (number >= 10) {
            number /= 10;
        }
        return (number + lastDigit);
    }
}
