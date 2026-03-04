public class MainSensitive {

    public static void main(String[] args) {

        CustomerInfo customer = new CustomerInfo("Rishi", "ACC12345");

        if (customer instanceof Sensitive) {
            System.out.println("Encrypting sensitive data...");
        }

        System.out.println(customer);
    }
}