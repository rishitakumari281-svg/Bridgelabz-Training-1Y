import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void generateException(String text) {
        char ch = text.charAt(text.length());
        System.out.println(ch);
    }

    static void handleException(String text) {
        try {
            char ch = text.charAt(text.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        generateException(text);
        handleException(text);
    }
}
