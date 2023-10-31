package homework_week_8;

/**
 * gram that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */
public class Programme_4_DigitSumChallenge {
    // declare static method wit return type parameter
    public static int sumDigits (int number){
        if(number < 10){
            return -1;
        }
        int sum =0;
        while (number > 0){ // while statement
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
//declare main method
    public static void main (String [] args) {
// print static method with parameter
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(-6));
        System.out.println(sumDigits(12345));
    }
    }
