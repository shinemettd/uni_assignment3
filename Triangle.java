/*
 *
 * @author shinemettd (David O.)
 *
 */

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (!isTriangleExists(side1, side2, side3)) {
            //throwing new exception if triangle does not exist
            throw new IllegalArgumentException("It is impossible to create a triangle with given sides.");
        }
        else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    //that method checks if triangle does exist or not
    public boolean isTriangleExists(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
