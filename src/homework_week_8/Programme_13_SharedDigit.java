package homework_week_8;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameter of type int.
 */
public class Programme_13_SharedDigit {
    //declare main method and called static method with parameter
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    // declare static method
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) { // if statement
            return false;
        }
        int c = a;

        //nested while loop
        while (c != 0) {
            int d = b;
            while (d != 0) {
                if ((c % 10) == (d % 10)) {
                    return true;
                }
                d /= 10;
            }
            c /= 10;
        }
        return false;
    }
}
