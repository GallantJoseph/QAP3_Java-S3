package Problem1;

/*
    Description: QAP 3 - Student Class, extends Person
    Author: Joseph Gallant
    Date: July 3, 2025
 */

public class Student extends Person{
    // Attributes
    protected String myIdNum;    // Student ID Number
    protected double myGPA;      // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa)  {
        super(name, age, gender);

        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and Setters
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double GPA) {
        this.myGPA = GPA;
    }

    @Override
    public String toString() {
        return super.toString() + ", idNum: " + this.myIdNum + ", GPA: " + this.myGPA;
    }
}