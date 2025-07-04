package Problem2;

/*
    Description: QAP 3 - Demo Class
    Author: Joseph Gallant
    Date: July 4, 2025
 */

public class Demo {
    public static void main(String[] args) {
        // Point testing
        Point myFirstPoint = new Point();
        Point mySecondPoint = new Point(-5,7);

        System.out.println("myFirstPoint: " + myFirstPoint);
        myFirstPoint.setX(9);
        myFirstPoint.setY(-3);
        System.out.println("myFirstPoint getX and getY after setX(9) and setY(-3): " + myFirstPoint.getX() + " " + myFirstPoint.getY());

        System.out.println("\nmySecondPoint: " + mySecondPoint);
        mySecondPoint.setXY(3,2);
        System.out.println("mySecondPoint getXY values after setXY(3,2): " + mySecondPoint.getXY()[0] + " " + mySecondPoint.getXY()[1]);

        // Movable testing
        MovablePoint myFirstMovable = new MovablePoint();
        MovablePoint mySecondMovable = new MovablePoint(-1, -7);
        MovablePoint myThirdMovable = new MovablePoint(3,-2,-4,7);

        System.out.println("\nmyFirstMovable: " + myFirstMovable);
        myFirstMovable.setXSpeed(1);
        myFirstMovable.setYSpeed(-2);
        System.out.println("myFirstMovable getXSpeed and getYSpeed after setXSpeed(1) and setYSpeed(-2): " +
                myFirstMovable.getXSpeed() + " " + myFirstMovable.getYSpeed());

        System.out.println("\nmySecondMovable: " + mySecondMovable);
        mySecondMovable.move();
        System.out.println("mySecondMovable after move of (-1,7) speed: " + mySecondMovable);

        System.out.println("\nmyThirdMovable: " + myThirdMovable);
        System.out.println("myThirdMovable getSpeed values: " + myThirdMovable.getSpeed()[0] + " " + myThirdMovable.getSpeed()[1]);

    }
}
