import java.sql.*;
import java.util.Scanner;

public class CustomerManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Customer Menu ---");
                System.out.println("1. Add Customer");
                System.out.println("2. Search Customer by Name");
                System.out.println("3. Update Phone Number");
                System.out.println("4. Delete Customer");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 INSERT
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO customers VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Phone: ");
                        String phone = sc.nextLine();

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, phone);

                        ps1.executeUpdate();
                        System.out.println("Customer Added!");
                        break;

                    // 🔹 READ (LIKE search)
                    case 2:
                        System.out.print("Enter name to search: ");
                        String search = sc.nextLine();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM customers WHERE name LIKE ?"
                        );

                        ps2.setString(1, "%" + search + "%");

                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nSearch Results:");
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
                                "UPDATE customers SET phone = ? WHERE id = ?"
                        );

                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new phone: ");
                        String newPhone = sc.nextLine();

                        ps3.setString(1, newPhone);
                        ps3.setInt(2, uid);

                        ps3.executeUpdate();
                        System.out.println("Phone Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps4 = con.prepareStatement(
                                "DELETE FROM customers WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps4.setInt(1, did);
                        ps4.executeUpdate();

                        System.out.println("Customer Deleted!");
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