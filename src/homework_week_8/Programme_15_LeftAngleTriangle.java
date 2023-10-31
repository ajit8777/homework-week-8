package homework_week_8;

/**
 * Display left angle triangle of * using nested for loops
 */
public class Programme_15_LeftAngleTriangle {
    //declare a main method and called static mathod into main method
    public static void main(String args[]) {
        getLeftAngleTriangle();
    }

    // declare a static method
    public static void getLeftAngleTriangle() {
        int rows = 5;
        //for loop statement
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
