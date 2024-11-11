package csc372.modiv.ctaivoptii;

public class Circle extends Shape {
    // Attribute
    private double radius;

    // Constructor initializes radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculate area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Calculate perimeter
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method prints out the area and perimeter
    @Override
    public String toString() {
        return "Circle [Area: " + area() + ", Perimeter: " + perimeter() + "]";
    }
}