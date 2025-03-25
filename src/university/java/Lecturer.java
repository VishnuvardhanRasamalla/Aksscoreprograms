package university.java;

public class Lecturer {
    private String lecturerID;
    private String name;
    private String email;
    private String telephone;
    private String address;
    // we have to write constructor , getter and setter
    public Lecturer(String lecturerID, String name, String email, String telephone, String address){
        this.lecturerID = lecturerID;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public String getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(String lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo() {
        System.out.println("Lecturer ID: " + lecturerID + ", Name: " + name);
    }
}
