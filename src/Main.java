import java.util.Scanner;

/*
 *
 * @author shinemettd (David O.)
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice = "";
        while (true) {
            System.out.print("Choose one of the shapes (Rectangle, Circle, Triangle or Square): ");
            userChoice = sc.nextLine();
            if (userChoice.equals("Rectangle")) {
                System.out.println("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                Rectangle rectangle = new Rectangle("Rectangle", width, height);
                System.out.println("The perimeter of your rectangle is " + rectangle.getPerimeter()
                        + "\nArea equals to " + rectangle.getArea() + '\n');
            }
            else if (userChoice.equals("Circle")) {
                System.out.println("Enter radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                Circle circle = new Circle("Circle", radius);
                System.out.println("The perimeter of your circle is " + circle.getPerimeter()
                        + "\nArea equals to " + circle.getArea() + '\n');
            }
            else if (userChoice.equals("Triangle")) {
                System.out.println("Enter side1: ");
                double side1 = sc.nextDouble();
                System.out.println("Enter side2: ");
                double side2 = sc.nextDouble();
                System.out.println("Enter side3: ");
                double side3 = sc.nextDouble();
                sc.nextLine();
                try { //trying to create a triangle, if triangle does not exist it gives to user an error
                    Triangle triangle = new Triangle("Triangle", side1, side2, side3);
                    System.out.println("The perimeter of your triangle is " + triangle.getPerimeter()
                            + "\nArea equals to " + triangle.getArea() + '\n');
                }
                catch (IllegalArgumentException e) {
                    System.out.println("It is impossible to create a triangle with given sides.");
                }
            }
            else if (userChoice.equals("Square")) {
                System.out.println("Enter side: ");
                double side = sc.nextDouble();
                sc.nextLine();
                Square square = new Square("Square", side);
                System.out.println("The perimeter of your square is " + square.getPerimeter()
                        + "\nArea equals to " + square.getArea() + '\n');
            }
            else if (userChoice.equals("Exit")) {
                return; //on the case if user wants to exit
            }
            else {
                System.out.println("\nIncorrect type of shape! If you want to exit, enter 'Exit', else try again.");
            }
        }
    }
}
