package Problem3;

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
    public Ellipse(String name, float minRad, float majRad) {
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
}