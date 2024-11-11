package csc372.modiv.ctaivoptii;

public class Triangle extends Shape {
    // Attributes
    private final double side1;
    private final double side2;
    private final double side3;

    // Constructor initializes side lengths
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Calculate perimeter
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // Calculate area
    @Override
    public double area() {
        double s = perimeter() / 2; // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // toString method prints out the area and perimeter
    @Override
    public String toString() {
        return "Triangle [Area: " + area() + ", Perimeter: " + perimeter() + "]";
    }
}
