package homework_week_8.programme_17_carpet_cost_calculator;

/**
 * Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 */
public class Carpet {
    //declare instance variable
    private double cost;

    //declare constructor
    public Carpet(double cost) {
        if (cost < 0) { // if-else statement
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    // declare instance variable
    public double getCost() {

        return cost;
    }
}
