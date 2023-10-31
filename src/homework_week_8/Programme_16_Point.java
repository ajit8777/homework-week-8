package homework_week_8;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int
 */
public class Programme_16_Point {
    //declare instance method
    public static class Point {
        //declare integer variable
        int x;
        int y;

        //declare constructor without parameter
        public Point() {

        }

        //declare constructor with parameter and initialize the field
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //instance method without parameter
        public int getX() {
            return x;
        }

        //instance method without parameter
        public int getY() {
            return y;
        }

        //instance method with parameter
        public void setX(int x) {
            this.x = x;
        }

        //instance method with parameter
        public void setY(int y) {
            this.y = y;
        }

        //instance method without parameter
        public double distance() {
            return Math.sqrt(this.x * this.x + this.y * this.y);
        }

        //instance method with parameter
        public double distance(int x, int y) {
            return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        }

        //instance method with parameter
        public double distance(Point xy) {
            return Math.sqrt((this.x - xy.x) * (this.x - xy.x) + (this.y - xy.y) * (this.y - xy.y));
        }

        //declare main method
        public static void main(String[] args) {
            Point first = new Point(6, 5);
            Point second = new Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Point point = new Point();
            System.out.println("distance()= " + point.distance());
        }
    }
}




