class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 1000;

    void withdraw(double amount) 
            throws InsufficientBalanceException, IllegalArgumentException {
        
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        try {
            acc.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}