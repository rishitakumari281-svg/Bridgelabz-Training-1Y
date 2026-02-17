import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Roll", 120, 2));
        order.add(new NonVegItem("Chicken Burger", 150, 3));

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).applyDiscount();
            }

            double finalAmount = total - discount;

            System.out.println("Final Amount: " + finalAmount);
            System.out.println("-------------------");
        }
    }
}
