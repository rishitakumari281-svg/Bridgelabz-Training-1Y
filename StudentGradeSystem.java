import java.util.*;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 85.0);
        map.put("B", 90.0);
        map.put("C", 70.0);

        map.put("A", 95.0);

        map.remove("C");

        TreeMap<String, Double> sorted = new TreeMap<>(map);

        for (Map.Entry<String, Double> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}