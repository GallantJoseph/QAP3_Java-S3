package Problem4;

/*
    Description: QAP 3 - Ellipse Class, extends Shape
    Author: Joseph Gallant
    Date: July 4, 2025
 */

public class Ellipse extends Shape {
    // Attributes
    private float minRad;
    private float majRad;

    // Constructors
    public Ellipse(String name, float radA, float radB) {
        super(name);

        // Validate the radius values (no negative)
        if (radA >= 0 && radB >= 0) {
            // Assign the minor radius to the smallest rad value and the major radius to the largest rad value
            // If they are equal, either way will work, but we keen them in the same order, in this situation.
            if (radA <= radB) {
                this.minRad = radA;
                this.majRad = radB;
            } else {
                this.minRad = radB;
                this.majRad = radA;
            }
        } else {
            throw new RuntimeException("Error: Invalid radius value. Must be positive.");
        }

    }

    public Ellipse(String name) {
        super(name);
    }

    public Ellipse() {
        super();
    }

    @Override
    public double getPerimeter() {
        double part1 = 2 * (minRad * minRad + majRad * majRad);
        double part2 = Math.pow (minRad - majRad, 2) / 2;

        return Math.PI * Math.sqrt(part1 - part2);
    }

    @Override
    public double getArea() {
        return Math.PI * minRad * majRad;
    }

    @Override
    public void scale(float factor) {
        this.minRad *= factor;
        this.majRad *= factor;
    }
}