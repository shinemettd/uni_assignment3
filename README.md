1. Shape class 

An abstract class called "Shape" with the following attributes and methods:

   - Attributes:

     - `name` (String): A variable that stores the name of the shape.

   - Abstract Methods:

     - `double getArea()`: An abstract method that calculates and returns the area of the shape.

     - `double getPerimeter()`: An abstract method that calculates and returns the perimeter of the shape.

2. Rectangle class 

Class called "Rectangle" that extends the "Shape" class. The "Rectangle" class should have the following attributes and methods:

   - Attributes:

     - `width` (double): The width of the rectangle.

     - `height` (double): The height of the rectangle.

   - Implemented the `getArea()` and `getPerimeter()` methods for rectangles.

3. Circle class

Class called "Circle" that extends the "Shape" class. The "Circle" class have the following attributes and methods:

   - Attributes:

     - `radius` (double): The radius of the circle.

   - Implemented the `getArea()` and `getPerimeter()` methods for circles.

4. Triangle class

Class called "Triangle" that extends the "Shape" class. The "Triangle" class should have the following attributes and methods:

   - Attributes:

     - `side1`, `side2`, `side3` (double) - Represents the lengths of the triangle's sides.

   - Implemented the `getArea()` and `getPerimeter()` methods for any kind of triangles.

5. Square class

A class called "Square" that extends the "Rectangle" class. The "Square" class should inherit attributes and methods from the "Rectangle" class but should also implement a constructor that takes a single side length as an argument.

6. Main class

Implements a user interactive program that does the following:

   - Allows the user to choose a shape type (Rectangle, Circle, Triangle or Square).

   - Based on the selected shape type, prompt the user for the necessary dimensions (e.g., length, width, radius).

   - Calculating and displaying the area and perimeter of the selected shape.

   - And repeating the process until the user chooses to exit the program.