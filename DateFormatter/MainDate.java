import java.time.LocalDate;

public class MainDate {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String format1 = DateUtils.formatDate(today, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(today, "MMM dd, yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
    }
}