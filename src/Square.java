package src;

/*
 *
 * @author shinemettd (David O.)
 *
 */
public class Square extends Rectangle {

    private double side;
    public Square(String name, double width) {
        super(name);
        side = width;
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return 4*side;
    }

    public double getSide() {
        return side;
    }
}
