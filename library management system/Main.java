import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B1", "Java Basics", "Author1"));
        items.add(new Magazine("M1", "Tech Monthly", "Author2"));
        items.add(new DVD("D1", "OOP Tutorial", "Author3"));

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.reserveItem("Rishi");
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println("-------------------");
        }
    }
}
