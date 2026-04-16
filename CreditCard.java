import java.util.*;

public class CreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();
        String regex = "^(4\\d{15}|5\\d{15})$";
        System.out.println(card.matches(regex));
    }
}