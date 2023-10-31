package homework_week_8;

/**
 * Even Digit Sum
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 */
public class Programme_11_EvenDigitSum {
    //declare a main method and called static method with parameter
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    // declare a static method with parameter
    public static int getEvenDigitSum(int number) {

        //declare a integer type variable
        int originalNumber = number;
        int lastDigit;
        int sumOfEvenDigit = 0;
        //if statement
        if (number > 0) {
            while (number > 0) { // while loop
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEvenDigit += lastDigit;
                }
                number /= 10;
            }
            if (originalNumber >= 0) {
                System.out.println();
            }
            return sumOfEvenDigit;
        }
        System.out.println();
        return -1;
    }
}
