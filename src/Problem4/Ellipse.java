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
    public Ellipse(String name, float minRad, float majRad) throws IllegalArgumentException {
        super(name);

        // Validate the radius values (no negative)
        if (minRad >= 0 && majRad >= 0) {
            // Assign the minor radius to the smallest rad value and the major radius to the largest rad value
            // If they are equal, either way will work, but we keen them in the same order, in this situation.
            if (minRad <= majRad) {
                this.minRad = minRad;
                this.majRad = majRad;
            } else {
                this.minRad = majRad;
                this.majRad = minRad;
            }
        } else {
            throw new IllegalArgumentException("Error: Invalid radius value. Must be positive.");
        }
    }

    @Override
    public double getPerimeter() {
        // If the Ellipse is not a Circle, use the Ellipse formula,
        // otherwise, use the Circle formula
        if (minRad != majRad) {
            double part1 = 2 * (minRad * minRad + majRad * majRad);
            double part2 = Math.pow (minRad - majRad, 2) / 2;

            return Math.PI * Math.sqrt(part1 - part2);
        } else {
            return 2 * Math.PI * minRad;
        }
    }

    @Override
    public double getArea() {
        // Works for Ellipses and Circles
        return Math.PI * minRad * majRad;
    }

    @Override
    public void scale(float factor) {
        this.minRad *= factor;
        this.majRad *= factor;
    }
}