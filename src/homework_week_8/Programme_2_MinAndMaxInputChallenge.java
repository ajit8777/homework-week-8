package homework_week_8;

import java.util.Scanner;

/**
 * 1. Before the user enters the number, print the message Enter number:
 * 2. If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 */
public class Programme_2_MinAndMaxInputChallenge {
    // Declare instance method.
    public void readTheNumbers() {
        //Declare scanner
        Scanner abc = new Scanner(System.in);
        int largeNumber = Integer.MIN_VALUE;
        int smallNumber = Integer.MAX_VALUE;
        int number;
// do while loop.
        do {
            System.out.println("Please enter a number or enter -99 to stop entering: ");
            number = abc.nextInt();
            //if statement
            if (number == -99)
                break;
            {
                //if else statement
                if (number > largeNumber) {
                    largeNumber = number;
                } else if (number < smallNumber) {
                    smallNumber = number;
                }
            }
        }
        //while loop
        while (number != -99);
        System.out.println("Maximum Number is : " + smallNumber);
        System.out.println("minimum Number is : " + largeNumber);
        abc.close();
    }


    // declare main method
    public static void main(String[] args) {
        // Declare object for calling instance method into Main method.
        Programme_2_MinAndMaxInputChallenge obj = new Programme_2_MinAndMaxInputChallenge();
        obj.readTheNumbers();
    }
}
