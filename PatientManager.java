import java.sql.*;
import java.util.Scanner;

public class PatientManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Patient Menu ---");
                System.out.println("1. Add Patient");
                System.out.println("2. Search by Disease");
                System.out.println("3. Update Disease");
                System.out.println("4. Delete Patient");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO patients VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();

                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.setString(3, disease);

                        ps1.executeUpdate();
                        System.out.println("Patient Added!");
                        break;

                    // 🔹 READ (specific disease)
                    case 2:
                        System.out.print("Enter disease to search: ");
                        String search = sc.nextLine();

                        PreparedStatement ps2 = con.prepareStatement(
                                "SELECT * FROM patients WHERE disease = ?"
                        );

                        ps2.setString(1, search);

                        ResultSet rs = ps2.executeQuery();

                        System.out.println("\nPatients with disease: " + search);
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
                                "UPDATE patients SET disease = ? WHERE id = ?"
                        );

                        System.out.print("Enter Patient ID: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter new disease: ");
                        String newDisease = sc.nextLine();

                        ps3.setString(1, newDisease);
                        ps3.setInt(2, uid);

                        ps3.executeUpdate();
                        System.out.println("Disease Updated!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps4 = con.prepareStatement(
                                "DELETE FROM patients WHERE id = ?"
                        );

                        System.out.print("Enter ID to delete: ");
                        int did = sc.nextInt();

                        ps4.setInt(1, did);
                        ps4.executeUpdate();

                        System.out.println("Patient Removed!");
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