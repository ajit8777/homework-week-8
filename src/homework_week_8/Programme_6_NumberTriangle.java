package homework_week_8;
/**
 * Write a program in Java to display the pattern like a triangle with a number
 */

import java.util.Scanner;

public class Programme_6_NumberTriangle {
    //declare main method
    public static void main(String[] args) {
        trianglePattern(); // calling static method in main method
    }

    public static void trianglePattern() {
        // declare integer type variable
        int a, b, c;
        //declare scanner
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter input number of row: ");
        c = abc.nextInt();
// for loop statement
        for (a = 1; a <= c; a++) {
            for (b = 1; b <= a; b++)
                System.out.print(b);
            System.out.println(" ");
        }
        //closing scanner object
        abc.close();
    }
}
