import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println(result);
    }

    static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        generateException(text);
        handleException(text);
    }
}
