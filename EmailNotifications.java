import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@mail.com", "b@mail.com");

        emails.forEach(e -> sendEmailNotification(e));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Sent to " + email);
    }
}