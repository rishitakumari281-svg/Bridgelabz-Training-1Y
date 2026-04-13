import java.util.*;

class Transaction {
    int id;

    Transaction(int id) {
        this.id = id;
    }

    public String toString() {
        return "Transaction " + id;
    }
}

class Account {
    int id;

    Account(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        return id == ((Account) o).id;
    }

    public int hashCode() {
        return id;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> queue = new LinkedList<>();
        Set<Account> accounts = new HashSet<>();
        Stack<Transaction> stack = new Stack<>();

        accounts.add(new Account(1));
        accounts.add(new Account(2));

        Transaction t1 = new Transaction(1);
        Transaction t2 = new Transaction(2);

        queue.add(t1);
        queue.add(t2);

        while (!queue.isEmpty()) {
            Transaction t = queue.remove();
            all.add(t);
            stack.push(t);
            System.out.println("Processed: " + t);
        }

        if (!stack.isEmpty()) {
            System.out.println("Rollback: " + stack.pop());
        }
    }
}