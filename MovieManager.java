import java.sql.*;
import java.util.Scanner;

public class MovieManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Movie Menu ---");
                System.out.println("1. Add Movie");
                System.out.println("2. Show Available Movies");
                System.out.println("3. Book Ticket");
                System.out.println("4. Delete Movie");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO movies VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter Movie ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Movie Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Seats: ");
                        int seats = sc.nextInt();

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setInt(3, seats);

                        ps1.executeUpdate();
                        System.out.println("Movie Added!");
                        break;

                    // 🔹 READ (available seats)
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM movies WHERE seats > 0"
                        );

                        System.out.println("\nAvailable Movies:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getInt(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE (book ticket → reduce seats)
                    case 3:
                        PreparedStatement ps2 = con.prepareStatement(
                                "UPDATE movies SET seats = seats - 1 WHERE id = ?"
                        );

                        System.out.print("Enter Movie ID: ");
                        int mid = sc.nextInt();

                        ps2.setInt(1, mid);
                        ps2.executeUpdate();

                        System.out.println("Ticket Booked!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM movies WHERE id = ?"
                        );

                        System.out.print("Enter Movie ID to delete: ");
                        int del = sc.nextInt();

                        ps3.setInt(1, del);
                        ps3.executeUpdate();

                        System.out.println("Movie Deleted!");
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