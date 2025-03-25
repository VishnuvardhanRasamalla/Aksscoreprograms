package university.java;

public class Subjects {
    private String subjectCode;
    private String subjectUnit;
    private String subjectDesc;
    private Lecturer lecturer;
// we have to write constructor , getter and setter
    public Subjects(String subjectCode, String subjectUnit, String subjectDesc, Lecturer lecturer ){
        this.subjectCode = subjectCode;
        this.subjectUnit = subjectUnit;
        this.subjectDesc = subjectDesc;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectUnit() {
        return subjectUnit;
    }

    public void setSubjectUnit(String subjectUnit) {
        this.subjectUnit = subjectUnit;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
    public void displayInfo() {
        System.out.println("Subject: " + subjectCode + ", Units: " + subjectUnit + ", Lecturer: " + lecturer.getName());
    }
}
