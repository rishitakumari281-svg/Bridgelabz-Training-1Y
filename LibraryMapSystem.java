import java.util.*;

public class LibraryMapSystem {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("111", "Java");
        map.put("222", "DSA");

        String isbn = "111";
        System.out.println(map.containsKey(isbn) ? map.get(isbn) : "Book not found");

        map.remove("222");

        TreeMap<String, String> sorted = new TreeMap<>(map);

        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        String title = "Java";
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getValue().equals(title)) {
                System.out.println(e.getKey());
            }
        }
    }
}