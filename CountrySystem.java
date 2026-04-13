import java.util.*;

public class CountrySystem {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");
        map.put("UK","London");
        map.put("France","Paris");
        map.put("Japan","Tokyo");
        map.put("China","Beijing");
        map.put("Germany","Berlin");
        map.put("Italy","Rome");

        String country = "India";

        System.out.println(map.containsKey(country) ? map.get(country) : "Unknown country");

        TreeMap<String, String> sorted = new TreeMap<>(map);

        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}