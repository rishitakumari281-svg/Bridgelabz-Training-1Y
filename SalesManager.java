import java.sql.*;
import java.util.Scanner;

public class SalesManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Sales Menu ---");
                System.out.println("1. Add Sale");
                System.out.println("2. Show Sales (qty > 1)");
                System.out.println("3. Update Quantity");
                System.out.println("4. Delete Sale");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO sales VALUES (?, ?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String book = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        ps1.setInt(1, id);
                        ps1.setString(2, book);
                        ps1.setInt(3, qty);
                        ps1.setDouble(4, price);

                        ps1.executeUpdate();
                        System.out.println("Sale Added!");
                        break;

                    // 🔹 READ (qty > 1)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM sales WHERE quantity > 1"
                        );

                        System.out.println("\nSales with quantity > 1:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getInt(3) + " " +
                                    rs.getDouble(4)
                            );
                        }
                        break;

                    // 🔹 UPDATE
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE sales SET quantity = ? WHERE id = ?"
                        );

                        System.out.print("Enter ID: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Quantity: ");
                        int newQty = sc.nextInt();

                        ps2.setInt(1, newQty);
                        ps2.setInt(2, uid);

                        ps2.executeUpdate();
                        System.out.println("Quantity Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM sales WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps3.setInt(1, did);
                        ps3.executeUpdate();

                        System.out.println("Sale Deleted!");
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