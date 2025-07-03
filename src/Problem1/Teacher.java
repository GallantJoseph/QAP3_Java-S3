package Problem1;

/*
    Description: QAP 3 - Teacher Class, extends Person
    Author: Joseph Gallant
    Dates: July 3, 2025
 */

public class Teacher extends Person {
    // Attributes
    protected String subject;
    protected double salary;

    // Constructor
    Teacher(String name, int age, String gender, String subject, double salary) {
        super(name,age,gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + this.subject + ", salary: " + this.salary;
    }
}
