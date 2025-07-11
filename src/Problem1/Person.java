package Problem1;

/*
    Description: QAP 3 - Person Class
    Author: Joseph Gallant
    Date: July 3, 2025
 */

public class Person {
    // Attributes
    protected String myName;
    protected int myAge;
    protected String myGender;  // "M” for Male, "F” for Female

    // Constructor
    public Person(String name, int age, String gender)  {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters and Setters
    public String getName() {
        return myName;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public String getGender() {
        return myGender;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    @Override
    public String toString()  {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}