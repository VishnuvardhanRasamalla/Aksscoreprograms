package exmp001;

public class Student {
    private String name;
    private String studentId;
    private String age;
    private Enrolment enrolment;

    //constructor

    public Student(String name, String studentId, String age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
