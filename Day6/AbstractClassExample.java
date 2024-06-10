// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
   abstract double area();

    // Concrete method
    public void displayArea() {
        System.out.println("Area: " + area());
    }
}

// Concrete subclass 1
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    public double area() {
        return length * width;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Using abstract class references
        Shape shape1 = circle;
        Shape shape2 = rectangle;

        // Calling abstract method and concrete method
        shape1.displayArea();  // Calls the area() method of the Circle class
        shape2.displayArea();  // Calls the area() method of the Rectangle class
    }
}
