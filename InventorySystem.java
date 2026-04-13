import java.util.*;

class Product {
    String name;
    int stock;

    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String toString() {
        return name + " " + stock;
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restock = new LinkedList<>();
        Stack<Product> history = new Stack<>();

        Product p1 = new Product("Milk",2);
        Product p2 = new Product("Bread",10);

        if (names.add(p1.name)) products.add(p1);
        if (names.add(p2.name)) products.add(p2);

        for (Product p : products) {
            if (p.stock < 5) restock.add(p);
        }

        while (!restock.isEmpty()) {
            Product p = restock.remove();
            p.stock += 10;
            history.push(p);
        }

        if (!history.isEmpty()) {
            Product p = history.pop();
            p.stock -= 10;
        }

        System.out.println(products);
    }
}