import java.sql.*;
import java.util.Scanner;

public class MenuManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Menu Manager ---");
                System.out.println("1. Add Item");
                System.out.println("2. Show Items < 200");
                System.out.println("3. Update Price");
                System.out.println("4. Delete Item");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO menu VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Item Name: ");
                        String item = sc.nextLine();

                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();

                        ps1.setInt(1, id);
                        ps1.setString(2, item);
                        ps1.setDouble(3, price);

                        ps1.executeUpdate();
                        System.out.println("Item Added!");
                        break;

                    // 🔹 READ (price < 200)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM menu WHERE price < 200"
                        );

                        System.out.println("\nAffordable Items:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getDouble(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE menu SET price = ? WHERE id = ?"
                        );

                        System.out.print("Enter Item ID: ");
                        int uid = sc.nextInt();

                        System.out.print("Enter New Price: ");
                        double newPrice = sc.nextDouble();

                        ps2.setDouble(1, newPrice);
                        ps2.setInt(2, uid);

                        ps2.executeUpdate();
                        System.out.println("Price Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM menu WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps3.setInt(1, did);
                        ps3.executeUpdate();

                        System.out.println("Item Removed!");
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