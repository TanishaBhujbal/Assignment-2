/*Create a Shape class with overloaded constructors: a. Default constructor initializes a circle with a default
radius.b. A constructor with parameters initializes a rectangle with length and breadth.c.Write a program to
calculate the area based on the constructor invoked.*/

public class Shape {
    double area;
    public Shape() {
        double radius = 6.0;
        area = Math.PI * radius * radius;
        System.out.println("Default Constructor: Circle with radius " + radius);
    }
    public Shape(double length, double breadth) {
        area = length * breadth;
        System.out.println("Parameterized Constructor: Rectangle with length " + length + " and breadth " +
                breadth);
    }
    public void displayArea() {
        System.out.println("Area: " + area);
    }
    public static void main(String[] args) {
        Shape circle = new Shape();
        circle.displayArea();
        Shape rectangle = new Shape(5.5, 3.0);
        rectangle.displayArea();
    }
}