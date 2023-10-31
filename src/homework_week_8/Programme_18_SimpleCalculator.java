package homework_week_8;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 */
public class Programme_18_SimpleCalculator {
    // declare class SimpleCalculator
    public static class SimpleCalculator {
        //declare double type variable
        double firstNumber;
        double secondNumber;

        //instance method without parameter
        public double getFirstNumber() {
            return firstNumber;
        }

        //instance method without parameter
        public double getSecondNumber() {
            return secondNumber;
        }

        //instance method with parameter
        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        //instance method with parameter
        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        //instance method without parameter
        public double getAdditionResult() {
            return firstNumber + secondNumber;
        }

        //instance method without parameter
        public double getSubtractionResult() {
            return firstNumber - secondNumber;
        }

        //instance method without parameter
        public double getMultiplicationResult() {
            return firstNumber * secondNumber;
        }

        //instance method without parameter
        public double getDivisionResult() {
            //declare if-else statement
            if (secondNumber == 0) {
                return this.secondNumber = 0;
            } else {
                return firstNumber / secondNumber;
            }
        }
    }

    //declare main method and called instance method by creating object.
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
