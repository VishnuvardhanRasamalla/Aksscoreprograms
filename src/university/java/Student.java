package university.java;

public class Student {
    private String studentID;
    private String name;
    private String address;
    private String dateOfBirth;
    private String telephone;
    private String nid;
    // we have to write constructor , getter and setter
    public Student(String studentID, String name, String address, String dateOfBirth, String telephone, String nid){
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
        this.nid = nid;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void displayInfo() {
            System.out.println("Student ID: " + studentID + ", Name: " + name);
    }
}
