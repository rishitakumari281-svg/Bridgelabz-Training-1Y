import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 60000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1000));

        for (Product p : products) {

            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
            }

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
