package university.java;

import javax.security.auth.Subject;

/*public class Enrollment {
    private String enrolmentDate;
    private String studentID;
    private String courseName;
    private student student;
    private subject subject;
    // we have to write constructor , getter and setter
    public Enrollment(String enrolmentDate, String studentID, String courseName, student studnt){
        this.enrolmentDate = enrolmentDate;
        this.courseName = courseName;
        this.studentID = studentID;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void displayInfo() {
        System.out.println("Student " + student.getName() + " is enrolled in Subject " + subject.getSubjectCode());
    }
} */
public class Enrollment {
    private Student student;
    private Subject subject;

    // Constructor
    public Enrollment(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }

    // Getters
    public Student getStudent() {
        return student;
    }
    public Subject getSubject() {
        return subject;
    }

    // Display Method
   // public void displayInfo() {
       // System.out.println("Student " + student.getName() + " is enrolled in Subject " + subject.getSubjectCode());

    @Override
    public String toString() {
        return "Enrollment{" +
                "student=" + student +
                ", subject=" + subject +
                '}';
    }
}

