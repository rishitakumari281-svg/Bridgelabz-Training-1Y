import java.util.*;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        System.out.println(username.matches(regex));
    }
}