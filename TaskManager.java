import java.sql.*;
import java.util.Scanner;

public class TaskManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Task Manager ---");
                System.out.println("1. Add Task");
                System.out.println("2. Show Pending Tasks");
                System.out.println("3. Mark as Completed");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO tasks VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Status (Pending/Completed): ");
                        String status = sc.nextLine();

                        ps1.setInt(1, id);
                        ps1.setString(2, title);
                        ps1.setString(3, status);

                        ps1.executeUpdate();
                        System.out.println("Task Added!");
                        break;

                    // 🔹 READ (Pending)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM tasks WHERE status = 'Pending'"
                        );

                        System.out.println("\nPending Tasks:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE (Pending → Completed)
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE tasks SET status = 'Completed' WHERE id = ?"
                        );

                        System.out.print("Enter Task ID: ");
                        int tid = sc.nextInt();

                        ps2.setInt(1, tid);
                        ps2.executeUpdate();

                        System.out.println("Task Completed!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM tasks WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps3.setInt(1, did);
                        ps3.executeUpdate();

                        System.out.println("Task Deleted!");
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