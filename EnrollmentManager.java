import java.sql.*;
import java.util.Scanner;

public class EnrollmentManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Enrollment Menu ---");
                System.out.println("1. Add Enrollment");
                System.out.println("2. Show by Course");
                System.out.println("3. Change Course");
                System.out.println("4. Delete Enrollment");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO enrollments VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String student = sc.nextLine();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();

                        ps1.setInt(1, id);
                        ps1.setString(2, student);
                        ps1.setString(3, course);

                        ps1.executeUpdate();
                        System.out.println("Enrollment Added!");
                        break;

                    // 🔹 READ (specific course)
                    case 2:
                        System.out.print("Enter Course: ");
                        String searchCourse = sc.nextLine();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM enrollments WHERE course = ?"
                        );

                        ps2.setString(1, searchCourse);

                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nStudents in course: " + searchCourse);
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE
                    case 3:
                        PreparedStatement ps3 = con.prepareStatement(
                                "UPDATE enrollments SET course = ? WHERE id = ?"
                        );

                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Course: ");
                        String newCourse = sc.nextLine();

                        ps3.setString(1, newCourse);
                        ps3.setInt(2, uid);

                        ps3.executeUpdate();
                        System.out.println("Course Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps4 = con.prepareStatement(
                                "DELETE FROM enrollments WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps4.setInt(1, did);
                        ps4.executeUpdate();

                        System.out.println("Enrollment Deleted!");
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}