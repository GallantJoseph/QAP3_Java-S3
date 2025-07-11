package Problem4;

/*
    Description: QAP 3 - Demo Class
    Author: Joseph Gallant
    Dates: July 4, 2025 - July 8, 2025
 */

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        try {
            // Constants
            final float SCALE_FACTOR = 1.5f;

            // Create an ArrayList of Scalable objects
            ArrayList<Scalable> scalables = new ArrayList<>();

            // Create one of each Shape
            Triangle myTriangle = new Triangle("myTriangle", 2,3,4);
            EquilateralTriangle myEquilatTriangle = new EquilateralTriangle("myEquilatTriangle", 7);
            Ellipse myEllipse = new Ellipse("myEllipse", 2, 3);
            Circle myCircle = new Circle("myCircle", 5);

            // Add the shapes to the scalables ArrayList
            scalables.add(myTriangle);
            scalables.add(myEquilatTriangle);
            scalables.add(myEllipse);
            scalables.add(myCircle);

            // Print the details of each Scalable object before and after scaling
            System.out.println("Scalable objects before scaling:");
            System.out.println("------------------------------------------------------------");
            for (Scalable scalable : scalables) {
                System.out.println(scalable);
            }

            // Scale each scalable object by a scale factor
            scale(scalables, SCALE_FACTOR);

            // Print the details after the scaling has been applied
            System.out.println("\nScalable objects with a scaling factor of " + SCALE_FACTOR);
            System.out.println("------------------------------------------------------------");
            for (Scalable scalable : scalables) {
                System.out.println(scalable);
            }

            System.out.println("\nExample of bad arguments used for a Triangle (side1=0, side2=2, side3=3):");
            Triangle badTriangle = new Triangle("badTriangle", 0, 2,3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Scales all objects in the given list of Scalable objects by the specified scaling factor.
     * Iterates over each Scalable object in the provided ArrayList
     * and calls its scale method with the given scale factor.
     *
     * @param scalables - the ArrayList containing objects that implement the Scalable interface
     * @param scaleFactor - the factor by which to scale each object
     */
    public static void scale(ArrayList<Scalable> scalables, float scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }
}
