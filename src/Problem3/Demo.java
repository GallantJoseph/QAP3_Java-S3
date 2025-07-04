package Problem3;

/*
    Description: QAP 3 - Demo Class
    Author: Joseph Gallant
    Date: July 4, 2025
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
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
