package exmp001;

public class Enrolment {
    private String courseName;
    private int studentId;
    private String enrolmentDate;
    private Student student;
    // constructor

    public Enrolment(String courseName, int studentId, String enrolmentDate, Student student) {
        this.courseName = courseName;
        this.studentId = studentId;
        this.student = student;
        this.enrolmentDate = enrolmentDate;
    }

    //getter and setter

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getEnrolmentDate() {
        return enrolmentDate;
    }

    public void setEnrolmentDate(String enrolmentDate) {
        enrolmentDate = enrolmentDate;
    }
}
