public class CustomerInfo implements Sensitive {

    private String name;
    private String accountNumber;

    public CustomerInfo(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "Name: " + name + ", Account: " + accountNumber;
    }
}