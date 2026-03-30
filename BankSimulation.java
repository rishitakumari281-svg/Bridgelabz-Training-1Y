class BankAccount implements Runnable {
    private String name;
    private String accountType;

    public BankAccount(String name, String accountType) {
        this.name = name;
        this.accountType = accountType;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + accountType + ") is checking balance | Priority: "
                    + Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        Thread premiumUser = new Thread(new BankAccount("Rishi", "Premium"));
        Thread regularUser = new Thread(new BankAccount("Aman", "Regular"));
        Thread basicUser = new Thread(new BankAccount("Neha", "Basic"));

     
        premiumUser.setPriority(10);
        regularUser.setPriority(5);
        basicUser.setPriority(1);


        premiumUser.start();
        regularUser.start();
        basicUser.start();
    }
}