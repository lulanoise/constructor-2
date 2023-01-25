package it.develhope.constructor;

/**
 * Class that defines a student
 * @author Capitan Harlock
 */
public class Student {
    public String name;
    public int grade;
    /**
     * Constructor method for creating a new Student object
     * @param studentName a String describing the student's name
     */

    public Student(String studentName){
        System.out.println("Creating a new student with name " + studentName);
        this.name = studentName;
    }
    /**
     * Method that prints the students details
     */
    public void getStudentDetails(){
        System.out.println("Name: " + this.name + ", Grade: " + this.grade);
    }
}