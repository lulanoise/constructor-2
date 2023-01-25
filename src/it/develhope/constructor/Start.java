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
        // create 2 students
        Student student1 = new Student("Harry");
        Student student2 = new Student("Hermione");
        // create 1 teacher
        Teacher teacher = new Teacher();
        // assign a name to the teacher
        teacher.teacherName = "Hagrid";
        // assign grades to the 2 students
        teacher.assignGrade(student1,85);
        teacher.assignGrade(student2,90);
        // print the students details
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}


        










