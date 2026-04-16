import java.util.*;

public class SSNValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        System.out.println(ssn.matches(regex));
    }
}