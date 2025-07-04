package Problem3;

/*
    Description: QAP 3 - Shape Class, abstract
    Author: Joseph Gallant
    Date: July 4, 2025
 */

public abstract class Shape {
    private String name;

    // Constructors
    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
        this.name = "Undefined";
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Name: %s, Perimeter: %.2f, Area: %.2f", name, getPerimeter(), getArea());
    };
}
