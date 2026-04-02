import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) special++;
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(special);
    }
}