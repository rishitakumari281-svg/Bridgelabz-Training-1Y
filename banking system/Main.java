import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S101", "Rishi", 20000));
        accounts.add(new CurrentAccount("C202", "Aman", 60000));

        for (BankAccount acc : accounts) {

            double interest = acc.calculateInterest();
            System.out.println(acc.getHolderName());
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                ((Loanable) acc).applyForLoan(100000);
            }

            System.out.println("-------------------");
        }
    }
}
