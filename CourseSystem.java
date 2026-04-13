import java.util.*;

public class CourseSystem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("CS102", 55);
        map.put("CS103", 3);
        map.put("CS104", 60);
        map.put("CS105", 2);

        map.put("CS101", map.get("CS101") + 5);
        map.put("CS103", Math.max(0, map.get("CS103") - 2));

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() >= 50) {
                System.out.println("Full: " + e.getKey());
            } else if (e.getValue() < 5) {
                System.out.println("Low: " + e.getKey());
            }
        }
    }
}