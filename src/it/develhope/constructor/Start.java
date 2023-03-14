package it.develhope.constructor;
/**
 * Tester class with main method.
 * @author Capitan Harlock
 */
public class Start {
    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {

        Student student1 = new Student("Harry");
        Student student2 = new Student("Hermione");

        Teacher teacher = new Teacher();

        teacher.teacherName = "Hagrid";

        teacher.assignGrade(student1,85);
        teacher.assignGrade(student2,90);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
