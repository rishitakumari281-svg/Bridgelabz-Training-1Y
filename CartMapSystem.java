import java.util.*;

public class CartMapSystem {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();

        map.put("Laptop", 40000.0);
        map.put("Phone", 15000.0);
        map.put("Headphones", 2000.0);

        double total = 0;
        for (double v : map.values()) total += v;

        if (total > 5000) total = total * 0.9;

        map.remove("Headphones");

        for (Map.Entry<String, Double> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("Total: " + total);
    }
}