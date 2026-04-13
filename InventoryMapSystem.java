import java.util.*;

public class InventoryMapSystem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Milk", 10);
        map.put("Bread", 5);

        map.put("Milk", map.get("Milk") - 10);

        if (map.get("Milk") <= 0) {
            map.remove("Milk");
        }

        map.put("Bread", map.getOrDefault("Bread", 0) + 20);

        String product = "Bread";
        System.out.println(map.containsKey(product) ? map.get(product) : "not stocked");

        System.out.println(map);
    }
}