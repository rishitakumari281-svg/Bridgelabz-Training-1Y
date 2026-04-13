import java.util.*;

public class SalarySystem {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A", 50000.0);
        map.put("B", 60000.0);
        map.put("C", 55000.0);
        map.put("D", 70000.0);
        map.put("E", 70000.0);
        map.put("F", 65000.0);

        String emp = "A";
        if (map.containsKey(emp)) {
            map.put(emp, map.get(emp) * 1.1);
        }

        double sum = 0;
        for (double v : map.values()) sum += v;

        double avg = sum / map.size();

        double max = Collections.max(map.values());

        for (Map.Entry<String, Double> e : map.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey());
            }
        }

        System.out.println(avg);
    }
}