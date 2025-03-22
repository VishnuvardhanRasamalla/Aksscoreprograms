package exmp001;

public class Course {
    private String courseName;
    private int courseId;
    private String courseCode;
    private Student student;
    //constructor

    public Course(String courseName, int courseId, String courseCode) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseCode = courseCode;
    }

    // getter and setter

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
