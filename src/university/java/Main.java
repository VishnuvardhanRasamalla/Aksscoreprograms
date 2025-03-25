package university.java;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Lecturer> lecturers = new ArrayList<>();
        ArrayList<Subject> subjects = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        System.out.println("=== University System ===");

        // Input for Lecturer
        System.out.println("\nEnter Lecturer Details:");
        System.out.print("Lecturer ID: ");
        String lecturerID = scanner.nextLine();
        System.out.print("Name: ");
        String lecturerName = scanner.nextLine();
        System.out.print("Address: ");
        String lecturerAddress = scanner.nextLine();
        System.out.print("Telephone: ");
        String lecturerTelephone = scanner.nextLine();
        System.out.print("Email: ");
        String lecturerEmail = scanner.nextLine();

        Lecturer lecturer = new Lecturer(lecturerID, lecturerName, lecturerAddress, lecturerTelephone, lecturerEmail);
        lecturers.add(lecturer);

        // Input for Subject
        System.out.println("\nEnter Subject Details:");
        System.out.print("Subject Code: ");
        String subjectCode = scanner.nextLine();
        System.out.print("Subject Unit: ");
        String subjectUnit = scanner.nextLine();
        System.out.print("Subject Description: ");
        String subjectDesc = scanner.nextLine();

        Subject subject = new Subject(subjectCode, subjectUnit, subjectDesc, lecturer);
        subjects.add(subject);

        // Input for Student
        System.out.println("\nEnter Student Details:");
        System.out.print("Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String studentDOB = scanner.nextLine();
        System.out.print("Address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Telephone: ");
        String studentTelephone = scanner.nextLine();
        System.out.print("National ID (NID): ");
        String studentNID = scanner.nextLine();

        Student student = new Student(studentID, studentName, studentDOB, studentAddress, studentTelephone, studentNID);
        students.add(student);

        // Enroll Student in Subject
        Enrollment enrollment = new Enrollment(student, subject);
        enrollments.add(enrollment);

        // Display Details
        System.out.println("\n=== Stored Data ===");
        lecturer.displayInfo();
        subject.displayInfo();
        student.displayInfo();
        enrollment.displayInfo();

        scanner.close();
    }
}

