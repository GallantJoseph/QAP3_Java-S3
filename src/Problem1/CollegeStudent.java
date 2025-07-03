package Problem1;

/*
    Description: QAP 3 - CollegeStudent Class, extends Student
    Author: Joseph Gallant
    Dates: July 3, 2025
 */

public class CollegeStudent extends Student {
    // Attributes
    protected String major;
    protected int year;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    // Getters and Setters
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", major: " + this.major + ", year: " + this.year;
    }
}
