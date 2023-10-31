package homework_week_8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x: where x represents the count, i.e. 1, 2, 3, 4, etc
 * For example, the first message printed to the user would be Enter number #1:, the next Enter number #2:, and so on.
 */
public class Programme_1_ReadingUserInputChallenge {
    // Declare main method.
    public static void main(String[] args) {
        // Calling an instance method into main method by creating object.
        Programme_1_ReadingUserInputChallenge obc = new Programme_1_ReadingUserInputChallenge();
        obc.m1();
    }
// Declare instance method
    public void m1() {
        int i = 1;
        int sum = 0;
        // Declare scanner
        Scanner abc = new Scanner(System.in);
        while (i <= 10) {
            System.out.println("Enter the Number #" + i);
            // Boolean variable
            boolean a = abc.hasNextInt();
            if (a) {
                int number = abc.nextInt();
                sum += number;
                i++;
            }
        }
        System.out.println("Invalid Number");
        System.out.println("Sum of all numbers = " + sum);
        // closing scanner object.
        abc.close();
    }
}
