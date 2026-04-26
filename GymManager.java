import java.sql.*;
import java.util.Scanner;

public class GymManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Gym Menu ---");
                System.out.println("1. Add Member");
                System.out.println("2. Show Premium Members");
                System.out.println("3. Extend Membership");
                System.out.println("4. Delete Member");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO members VALUES (?, ?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Type (Premium/Basic): ");
                        String type = sc.nextLine();

                        System.out.print("Enter Months: ");
                        int months = sc.nextInt();

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, type);
                        ps1.setInt(4, months);

                        ps1.executeUpdate();
                        System.out.println("Member Added!");
                        break;

                    // 🔹 READ (Premium)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM members WHERE type = 'Premium'"
                        );

                        System.out.println("\nPremium Members:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3) + " " +
                                    rs.getInt(4)
                            );
                        }
                        break;

                    // 🔹 UPDATE (extend months)
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE members SET months = months + ? WHERE id = ?"
                        );

                        System.out.print("Enter Member ID: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter months to extend: ");
                        int addMonths = sc.nextInt();

                        ps2.setInt(1, addMonths);
                        ps2.setInt(2, uid);

                        ps2.executeUpdate();
                        System.out.println("Membership Extended!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM members WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps3.setInt(1, did);
                        ps3.executeUpdate();

                        System.out.println("Member Removed!");
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