import java.util.*;

class Product {
    String name;
    int price;
    int rating;
    int discount;

    Product(String name, int price, int rating, int discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class ProductSort {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("A", 500, 4, 10));
        list.add(new Product("B", 200, 5, 20));
        list.add(new Product("C", 300, 3, 15));

        list.sort((a, b) -> a.price - b.price);
        list.forEach(p -> System.out.println(p.name + " " + p.price));

        list.sort((a, b) -> b.rating - a.rating);
        list.forEach(p -> System.out.println(p.name + " " + p.rating));

        list.sort((a, b) -> b.discount - a.discount);
        list.forEach(p -> System.out.println(p.name + " " + p.discount));
    }
}