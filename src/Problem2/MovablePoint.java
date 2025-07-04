package Problem2;

/*
    Description: QAP 3 - Movable Class
    Author: Joseph Gallant
    Dates: July 3, 2025 - July 4, 2025
 */

public class MovablePoint extends Point {
    // Attributes
    private float xSpeed;
    private float ySpeed;

    // Constructors
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0f;
        this.ySpeed = 0f;
    }

    // Getters and Setters
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return (super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")");
    }

    public void move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
    }
}
