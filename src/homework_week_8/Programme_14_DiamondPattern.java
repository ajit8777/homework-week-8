package homework_week_8;
/**
 * Write a program in Java to display the pattern like a diamond.
 * while loop
 */

import java.util.Scanner;

public class Programme_14_DiamondPattern {
    //declare a main method
    public static void main(String[] args) {
        //create object and calling instance method into main method
        Programme_14_DiamondPattern obj = new Programme_14_DiamondPattern();
        obj.diamondPattern();
    }

    //declare instance method
    public void diamondPattern() {
        //declare a scanner
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter number maximum star in row: ");
        int number = abc.nextInt();
        int m = 1;
        int n;
        // nested do while loop
        do {
            n = 1;
            do {
                System.out.print(" ");
            }
            while (++n <= number - m + 1);
            n = 1;
            do {
                System.out.print("*");
            }
            while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (++m <= number);
        m = number - 1;
        do {
            n = 1;
            do {
                System.out.print(" ");
            } while (++n <= number - m + 1);
            n = 1;
            do {
                System.out.print("*");
            } while (++n <= m * 2 - 1);
            System.out.println();
        }
        while (--m > 0);
        abc.close();
    }
}
