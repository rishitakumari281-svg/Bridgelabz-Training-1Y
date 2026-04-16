import java.util.*;

public class LicensePlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plate = sc.nextLine();
        String regex = "^[A-Z]{2}\\d{4}$";
        System.out.println(plate.matches(regex));
    }
}