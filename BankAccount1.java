class BankAccount1 {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount1 {
    void display() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }
}
