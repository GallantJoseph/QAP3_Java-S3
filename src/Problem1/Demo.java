package Problem1;

/*
    Description: QAP 3 - Demo Class
    Author: Joseph Gallant
    Date: July 3, 2025
 */

public class Demo {
    public static void main(String[] args) {
        Person personJohn = new Person("John Doe", 35, "F");
        Teacher teacherJane = new Teacher("Jane Smith", 45, "M", "English", 78000.00);
        Student studentRobert = new Student("Robert Stanley", 56, "M", "23456", 3.4);
        CollegeStudent collegeStudentJoseph = new CollegeStudent("Joseph Gallant", 37, "M", "12345", 3.5, "Computer Science", 1);

        System.out.println("Person: " + personJohn);
        System.out.println("Teacher: " + teacherJane);
        System.out.println("Student: " + studentRobert);
        System.out.println("CollegeStudent: " + collegeStudentJoseph);
    }
}
