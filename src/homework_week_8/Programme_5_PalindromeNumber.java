package homework_week_8;

/**
 * Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 */
public class Programme_5_PalindromeNumber {
    // declare static method wit return type parameter
    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int originalNumber = number;
        while (number != 0) { //declare while loop
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reversed;
    }

    //declare main method
    public static void main(String[] args) {
        // print static method with parameter
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(523));

    }
}
