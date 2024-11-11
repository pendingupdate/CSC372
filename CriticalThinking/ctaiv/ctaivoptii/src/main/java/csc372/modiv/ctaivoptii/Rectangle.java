package csc372.modiv.ctaivoptii;

public class Rectangle extends Shape {
    // Attributes
    private final double width;
    private final double length;

    // Constructor initializes width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Calculate area
    @Override
    public double area() {
        return width * length;
    }

    // Calculate perimeter
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    // toString method prints out the area and perimeter
    @Override
    public String toString() {
        return "Rectangle [Area: " + area() + ", Perimeter: " + perimeter() + "]";
    }
}
