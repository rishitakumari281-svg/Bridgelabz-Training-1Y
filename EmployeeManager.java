import java.sql.*;
import java.util.Scanner;

public class EmployeeManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            // 1. INSERT
            PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO employee VALUES (?, ?, ?)"
            );

            ps1.setInt(1, 101);
            ps1.setString(2, "Rishi");
            ps1.setDouble(3, 40000);
            ps1.executeUpdate();

            // 2. SELECT (salary > 30000)
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(
                "SELECT * FROM employee WHERE salary > 30000"
            );

            System.out.println("Employees with salary > 30000:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getDouble(3));
            }

            // 3. UPDATE (increase by 10%)
            PreparedStatement ps2 = con.prepareStatement(
                "UPDATE employee SET salary = salary * 1.1 WHERE id = ?"
            );
            ps2.setInt(1, 101);
            ps2.executeUpdate();

            // 4. DELETE (salary < 15000)
            PreparedStatement ps3 = con.prepareStatement(
                "DELETE FROM employee WHERE salary < 15000"
            );
            ps3.executeUpdate();

            System.out.println("Operations completed!");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}