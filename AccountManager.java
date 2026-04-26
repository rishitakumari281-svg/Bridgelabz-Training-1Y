import java.sql.*;
import java.util.Scanner;

public class AccountManager {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "your_password";

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            int choice;

            do {
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Add Account");
                System.out.println("2. Show Balance > 10000");
                System.out.println("3. Deposit/Withdraw");
                System.out.println("4. Delete Account");
                System.out.println("5. Exit");

                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    // 🔹 CREATE
                    case 1:
                        PreparedStatement ps1 = con.prepareStatement(
                                "INSERT INTO accounts VALUES (?, ?, ?)"
                        );

                        System.out.print("Enter Account No: ");
                        int accNo = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Balance: ");
                        double balance = sc.nextDouble();

                        ps1.setInt(1, accNo);
                        ps1.setString(2, name);
                        ps1.setDouble(3, balance);

                        ps1.executeUpdate();
                        System.out.println("Account Created!");
                        break;

                    // 🔹 READ
                    case 2:
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(
                                "SELECT * FROM accounts WHERE balance > 10000"
                        );

                        System.out.println("\nAccounts with balance > 10000:");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt(1) + " " +
                                    rs.getString(2) + " " +
                                    rs.getDouble(3)
                            );
                        }
                        break;

                    // 🔹 UPDATE (Deposit/Withdraw)
                    case 3:
                        System.out.print("Enter Account No: ");
                        int acc = sc.nextInt();

                        System.out.print("1. Deposit  2. Withdraw: ");
                        int type = sc.nextInt();

                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        PreparedStatement ps2;

                        if (type == 1) {
                            ps2 = con.prepareStatement(
                                "UPDATE accounts SET balance = balance + ? WHERE accNo = ?"
                            );
                        } else {
                            ps2 = con.prepareStatement(
                                "UPDATE accounts SET balance = balance - ? WHERE accNo = ?"
                            );
                        }

                        ps2.setDouble(1, amt);
                        ps2.setInt(2, acc);

                        ps2.executeUpdate();
                        System.out.println("Transaction Done!");
                        break;

                    // 🔹 DELETE
                    case 4:
                        PreparedStatement ps3 = con.prepareStatement(
                                "DELETE FROM accounts WHERE accNo = ?"
                        );

                        System.out.print("Enter Account No to delete: ");
                        int del = sc.nextInt();

                        ps3.setInt(1, del);
                        ps3.executeUpdate();

                        System.out.println("Account Deleted!");
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