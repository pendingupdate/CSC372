package csc372.modiv.ctaivoptii;

public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate triangle
        Triangle triangle = new Triangle(6, 7, 8);
        // Instantiate circle
        Circle circle = new Circle(7);
        // Instantiate square (which is a rectangle with 4 sides of the same length)
        Rectangle square = new Rectangle(6, 6);

        // Store class instances into array named "shapeArray"
        Shape[] shapeArray = {triangle, circle, square};

        // Loop through shapeArray
        for (Shape shape : shapeArray) {
            // print out the instance data of each object using the object instance's "toString" method
            System.out.println(shape.toString());
        }
    }
}
