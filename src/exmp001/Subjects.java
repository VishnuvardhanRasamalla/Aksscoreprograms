package exmp001;

public class Subjects {
    private String subjectCode;
    private int subjectUnit;
    private String subjectDesc;
    private Student student;

    // Constructor


    public Subjects(String subjectCode, int subjectUnit, String subjectDesc) {
        this.subjectCode = subjectCode;
        this.subjectUnit = subjectUnit;
        this.subjectDesc = subjectDesc;
    }
    //getter setter method

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public int getSubjectUnit() {
        return subjectUnit;
    }

    public void setSubjectUnit(int subjectUnit) {
        this.subjectUnit = subjectUnit;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }
}
