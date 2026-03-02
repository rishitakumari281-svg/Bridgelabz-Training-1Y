import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {

        Student s = new Student("Rishi", 101);
        Faculty f = new Faculty("Dr Mehta", "Java");

        s.display();
        f.display();
    }
}