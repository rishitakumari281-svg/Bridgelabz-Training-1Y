import java.util.*;

public class MergeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A",1);
        m1.put("B",2);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B",3);
        m2.put("C",4);

        for (Map.Entry<String, Integer> e : m2.entrySet()) {
            m1.put(e.getKey(), m1.getOrDefault(e.getKey(), 0) + e.getValue());
        }

        System.out.println(m1);
    }
}