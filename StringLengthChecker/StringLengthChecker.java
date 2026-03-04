import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int limit = 20;

      
        Function<String, Integer> getLength = message -> message.length();

        String message = "Hello Rishi this is Java";

        int length = getLength.apply(message);

        System.out.println("Message Length: " + length);

        if (length > limit) {
            System.out.println("Message exceeds limit!");
        } else {
            System.out.println("Message is within limit.");
        }
    }
}