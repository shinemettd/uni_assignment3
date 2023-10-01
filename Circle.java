/*
 *
 * @author shinemettd (David O.)
 *
 */

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getPI() {
        return PI;
    }
}
