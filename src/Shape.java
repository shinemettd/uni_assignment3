package src;

/*
 *
 * @author shinemettd (David O.)
 *
 */

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
