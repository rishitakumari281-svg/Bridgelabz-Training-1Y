package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

import static java.lang.System.out;  // static import

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rishi", "Computer Science");
        Faculty f1 = new Faculty(201, "Dr. Sharma", "Java Programming");
        Department d1 = new Department(301, "Engineering");

        out.println("----- COLLEGE INFORMATION -----");

        d1.displayDepartment();
        f1.displayFaculty();
        s1.displayStudent();
    }
}