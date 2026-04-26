import java.sql.*;
import java.util.Scanner;

public class LibraryManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Library Menu ---");
                System.out.println("1. Add Book");
                System.out.println("2. Show Available Books");
                System.out.println("3. Issue Book");
                System.out.println("4. Delete Book");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 INSERT
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO books VALUES (?, ?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();

                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();

                        System.out.print("Enter Status (Available/Issued): ");
                        String status = sc.nextLine();

                        ps1.setInt(1, id);
                        ps1.setString(2, title);
                        ps1.setString(3, author);
                        ps1.setString(4, status);

                        ps1.executeUpdate();
                        System.out.println("Book Added!");
                        break;

                    // 🔹 READ (Available books)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM books WHERE status = 'Available'"
                        );

                        System.out.println("\nAvailable Books:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getString(3) + " " +
                                    rs.getString(4)
                            );
                        }
                        break;

                    // 🔹 UPDATE (Issue book)
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE books SET status = 'Issued' WHERE id = ?"
                        );

                        System.out.print("Enter Book ID to issue: ");
                        int issueId = sc.nextInt();

                        ps2.setInt(1, issueId);
                        ps2.executeUpdate();

                        System.out.println("Book Issued!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM books WHERE id = ?"
                        );

                        System.out.print("Enter Book ID to delete: ");
                        int delId = sc.nextInt();

                        ps3.setInt(1, delId);
                        ps3.executeUpdate();

                        System.out.println("Book Deleted!");
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