package homework_week_8;
/**
 * Write a program to input any number and check if it Armstrong number or not
 */

import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    //declare main method
    public static void main(String[] args) {
        armNumber(); // called static method into main method
    }

    // declare static method
    public static void armNumber() {
        //declare variable
        int number, originalNumber, remainder, result = 0;
        Scanner scan = new Scanner(System.in);// declare scanner
        System.out.println("Please insert a any number :");
        number = scan.nextInt();
        originalNumber = number;

        //while loop
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        //if-else statement
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
            scan.close();
        }
    }
}
