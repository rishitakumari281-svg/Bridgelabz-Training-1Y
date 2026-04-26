import java.sql.*;
import java.util.Scanner;

public class VehicleManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Vehicle Service Menu ---");
                System.out.println("1. Add Vehicle");
                System.out.println("2. Show Pending Vehicles");
                System.out.println("3. Mark as Completed");
                System.out.println("4. Delete Vehicle");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO vehicles VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter Registration No: ");
                        String regNo = sc.nextLine();

                        System.out.print("Enter Owner Name: ");
                        String owner = sc.nextLine();

                        System.out.print("Enter Status (Pending/Completed): ");
                        String status = sc.nextLine();

                        ps1.setString(1, regNo);
                        ps1.setString(2, owner);
                        ps1.setString(3, status);

                        ps1.executeUpdate();
                        System.out.println("Vehicle Added!");
                        break;

                    // 🔹 READ (Pending)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM vehicles WHERE status = 'Pending'"
                        );

                        System.out.println("\nPending Vehicles:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getString(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE (Pending → Completed)
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE vehicles SET status = 'Completed' WHERE regNo = ?"
                        );

                        System.out.print("Enter Registration No: ");
                        String rno = sc.nextLine();

                        ps2.setString(1, rno);
                        ps2.executeUpdate();

                        System.out.println("Status Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM vehicles WHERE regNo = ?"
                        );

                        System.out.print("Enter Registration No to delete: ");
                        String del = sc.nextLine();

                        ps3.setString(1, del);
                        ps3.executeUpdate();

                        System.out.println("Vehicle Removed!");
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