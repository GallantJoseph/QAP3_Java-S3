package Problem3;

/*
    Description: QAP 3 - Triangle Class, extends Shape
    Author: Joseph Gallant
    Dates: July 4, 2025 - July 8, 2025
 */

public class Triangle extends Shape {
    private float side1;
    private float side2;
    private float side3;

    // Constructors
    public Triangle(String name, float side1, float side2, float side3) throws IllegalArgumentException {
        super(name);

        // Validate the side values
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Error: Invalid triangle side(s).");
        }
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double getArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
    }
}
