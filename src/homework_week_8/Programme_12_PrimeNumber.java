package homework_week_8;
/**
 * Write a programme to input any number and check if it is prime or not.
 */

import java.util.Scanner;

public class Programme_12_PrimeNumber {
    //declare a main method and called static method into main method
    public static void main(String[] args) {
        primes();
    }

    //declare a static method
    public static boolean primes() {
        int num;
        //declare scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number; ");
        num = scan.nextInt();
        //closing scanner object
        scan.close();
        //for loop statement
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // if statement
                System.out.println(num + " is not a prime number.");
                return false;
            }
        }
        System.out.println(num + " is a prime number");
        return true;
    }
}
