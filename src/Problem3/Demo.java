package Problem3;

/*
    Description: QAP 3 - Demo Class
    Author: Joseph Gallant
    Dates: July 4, 2025 - July 8, 2025
 */

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        try {
            // Create an ArrayList of Shape objects
            ArrayList<Shape> shapes = new ArrayList<>();

            // Create one of each Shape
            Triangle myTriangle = new Triangle("myTriangle", 2,3,4);
            EquilateralTriangle myEquilatTriangle = new EquilateralTriangle("myEquilatTriangle", 7);
            Ellipse myEllipse = new Ellipse("myEllipse", 2, 3);
            Circle myCircle = new Circle("myCircle", 5);

            // Add the shapes to the shapes ArrayList
            shapes.add(myTriangle);
            shapes.add(myEquilatTriangle);
            shapes.add(myEllipse);
            shapes.add(myCircle);

            // Call each Shape's toString method
            for (Shape shape : shapes) {
                System.out.println(shape);
            }

            System.out.println("\nExample of bad arguments used for a Triangle (side1=0, side2=2, side3=3):");
            Problem4.Triangle badTriangle = new Problem4.Triangle("badTriangle", 0, 2,3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
