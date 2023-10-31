package homework_week_8;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    //declare main method
    public static void main(String[] args) {
        fiboNumber(); // calling static method in main method
    }

    //declare static method
    public static void fiboNumber() {
        //declare int type variable
        int a = 1;
        int b = 1;
        int s = 7;
        //for loop statement
        for (int i = 0; i <= s; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
