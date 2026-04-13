import java.util.*;

public class DepartmentMapSystem {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "HR");
        map.put(2, "IT");
        map.put(3, "HR");
        map.put(4, "Finance");

        map.put(2, "Finance");

        String dept = "HR";
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            if (e.getValue().equals(dept)) {
                System.out.println(e.getKey());
            }
        }

        Map<String, Integer> count = new HashMap<>();
        for (String d : map.values()) {
            count.put(d, count.getOrDefault(d, 0) + 1);
        }

        System.out.println(count);
    }
}