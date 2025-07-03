package Problem1;

/*
    Description: QAP 3 - Student Class, extends Person
    Author: Joseph Gallant
    Dates: July 3, 2025
 */

public class Student extends Person{
    // Attributes
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa)  {
        // use the super class’ constructor
        super(name, age, gender);

        // initialize what’s new to Student
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