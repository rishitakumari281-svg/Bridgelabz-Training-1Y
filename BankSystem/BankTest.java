public class BankTest {

    public static void main(String[] args) {

        Account a1 = new SavingsAccount();
        a1.accountNumber = 101;
        a1.balance = 10000;

        Account a2 = new CurrentAccount();
        a2.accountNumber = 102;
        a2.balance = 10000;

        System.out.println("Bank Name: " + Account.bankName);

        System.out.println("Savings Interest: " + a1.calculateInterest());
        System.out.println("Current Interest: " + a2.calculateInterest());
    }
}