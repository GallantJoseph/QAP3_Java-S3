package Problem2;

/*
    Description: QAP 3 - Point Class
    Author: Joseph Gallant
    Dates: July 3, 2025 - July 4, 2025
 */

public class Point {
    // Attributes
    private float x;
    private float y;

    // Constructors
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0f;
        this.y = 0f;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY () {
        return new float[] {x,y};
    }

    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }
}
