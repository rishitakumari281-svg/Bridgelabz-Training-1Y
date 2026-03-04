public class MainValidator {

    public static void main(String[] args) {

        String password = "Rishi123";

        boolean result = SecurityUtils.isStrongPassword(password);

        if (result)
            System.out.println("Strong Password");
        else
            System.out.println("Weak Password");
    }
}