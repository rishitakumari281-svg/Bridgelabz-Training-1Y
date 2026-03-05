public class StudentTest {

    public static void main(String[] args) {

        EngineeringStudent s1 = new EngineeringStudent();

        s1.rollNo = 101;
        s1.name = "Rishi";
        s1.branch = "CSE";
        s1.marks = 85;

        System.out.println("Student: " + s1.getStudentDetails());
        System.out.println("Grade: " + s1.calculateGrade());
    }
}