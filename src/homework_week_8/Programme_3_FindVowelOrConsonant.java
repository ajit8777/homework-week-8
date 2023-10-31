package homework_week_8;
/**
 * gram that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
 */

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    //declare instance method
    public void findVowelOrConsonant() {
        // scanner declare
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a single character of alphabetical : ");
        String a = abc.next();

        if (abc.hasNext()) { // if-else statement
            a = a.toLowerCase();
//nested if-else statement
            if (a.equals("a") || a.equals("i") || a.equals("o") || a.equals("u") || a.equals("e")) {
                System.out.println("Input letter is Vowel");
            } else if (a.length() > 1) {
                System.out.println("Error Message");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error");
        }
        abc.close();//closing scanner object
    }

    //main method declare
    public static void main(String[] args) {
        // Calling an instance method into main method by creating object.
        Programme_3_FindVowelOrConsonant obj = new Programme_3_FindVowelOrConsonant();
        obj.findVowelOrConsonant();
    }
}
