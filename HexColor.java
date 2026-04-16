import java.util.*;

public class HexColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        String regex = "^#[0-9A-Fa-f]{6}$";
        System.out.println(color.matches(regex));
    }
}