import java.util.*;

public class SentenceFrequencySystem {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful";

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}