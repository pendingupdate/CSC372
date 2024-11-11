# CSC372: Computer Programming II

## Module 3 - Option 2:  Creating an Abstract Class Shape II

Create an abstract class "Shape" with the following specifications:

1. an abstract method "area()" of return type double
2. an abstract method "perimeter()" of return type double.

Put your code in a Java source file named "Shape.java."

### I.

Create a class "Rectangle" that extends the Shape class with the following specifications:

1. Attributes:
    - width, length
2. Constructor:
    - Implement a parameterized constructor needed to initialize the data.
3. toString:
    - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

### II.

Create a class "Circle" that extends the Shape class with the following specifications:

1. Attributes:
    - radius
2. Constructor:
    - Implement a parameterized constructor to initialize the data.
3. toString:
    - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

### III.

Create a class "Triangle" that extends the Shape class with the following specifications:

1. Attributes:
    - length of side1, length of side2, length of side3, each is a double
2. Constructor:
    - Implement a parameterized constructor to initialize the data.
3. toString:
    - Implement a "toString" method that prints out the area and perimeter.

Implement methods to compute the area and perimeter.

### IV.

Create a driver class named "ShapeArray" with the following specifications:

1. Instantiate one triangle.
2. Instantiate one circle.
3. Instantiate one square.
4. Store the class instances into an array named "shapeArray."
5. Loop through the array and print out the instance data of each object
   using the object instance's "toString" method.
6. Show a UML diagram of your project.

Zip up your source files and UML diagram into a single zip file and submit the zip file as your CTA.

**Students must use appropriate version control for all programmatic assignments created. GIT repositories should be
established and screen captures of repositories submitted with each assignment.**