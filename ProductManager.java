import java.sql.*;
import java.util.Scanner;

public class ProductManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Product Menu ---");
                System.out.println("1. Add Products (3)");
                System.out.println("2. Show Low Stock (qty < 10)");
                System.out.println("3. Update Quantity");
                System.out.println("4. Delete Product");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 INSERT 3 PRODUCTS
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO product VALUES (?, ?, ?)"
                        );

                        for (int i = 1; i <= 3; i++) {
                            System.out.println("Enter details for product " + i);

                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Quantity: ");
                            int qty = sc.nextInt();

                            ps1.setInt(1, id);
                            ps1.setString(2, name);
                            ps1.setInt(3, qty);

                            ps1.executeUpdate();
                        }

                        System.out.println("3 Products Added!");
                        break;

                    // 🔹 READ LOW STOCK
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM product WHERE qty < 10"
                        );

                        System.out.println("\nLow Stock Products:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getInt(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE QTY
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE product SET qty = qty + ? WHERE pid = ?"
                        );

                        System.out.print("Enter Product ID: ");
                        int pid = sc.nextInt();

                        System.out.print("Enter quantity to add: ");
                        int addQty = sc.nextInt();

                        ps2.setInt(1, addQty);
                        ps2.setInt(2, pid);

                        ps2.executeUpdate();
                        System.out.println("Quantity Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM product WHERE pid = ?"
                        );

                        System.out.print("Enter Product ID to delete: ");
                        int delId = sc.nextInt();

                        ps3.setInt(1, delId);
                        ps3.executeUpdate();

                        System.out.println("Product Deleted!");
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