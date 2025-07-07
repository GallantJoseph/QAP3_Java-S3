package Problem3;

/*
    Description: QAP 3 - Shape Class, abstract
    Author: Joseph Gallant
    Dates: July 4, 2025 - July 7, 2025
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

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Name: %s, Perimeter: %.2f, Area: %.2f", name, getPerimeter(), getArea());
    };
}
