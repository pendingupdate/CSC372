package csc372.modiv.ctaivoptii;

public class Rectangle extends Shape {
    private double width;
    private double length;

    // Parameterized constructor to initialize width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Method to calculate area
    @Override
    public double area() {
        return width * length;
    }

    // Method to calculate perimeter
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    // toString method to print area and perimeter
    @Override
    public String toString() {
        return "Rectangle [Area: " + area() + ", Perimeter: " + perimeter() + "]";
    }
}
