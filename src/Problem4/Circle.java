package Problem4;

/*
    Description: QAP 3 - Circle Class, extends Shape
    Author: Joseph Gallant
    Date: July 4, 2025
 */

public class Circle extends Ellipse {
    // Constructors
    public Circle(String name, float radius) {
        super(name, radius, radius);
    }

    public Circle(String name) {
        super(name);
    }

    public Circle() {
        super();
    }
}
