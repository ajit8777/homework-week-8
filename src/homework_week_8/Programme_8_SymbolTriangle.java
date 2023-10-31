package homework_week_8;

/**
 * Display right angle triangle of @ using nested for loops
 */
public class Programme_8_SymbolTriangle {
    //declare a static method with return type parameter
    public static void rightTriangle(int n) {
        int a, b; // declare integer type variable
//declare nested for loop
        for (a = 0; a < n; a++) {

            for (b = 0; b <= a; b++) {
                // printing symbol
                System.out.print("@ ");
            }
            System.out.println();
        }
    }

    //declare main method.
    public static void main(String args[]) {
        int c = 5;
        rightTriangle(c);
    }

}
