import java.util.*;

public class AttendanceSystem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A",0);
        map.put("B",0);
        map.put("C",0);
        map.put("D",0);
        map.put("E",0);

        List<List<String>> days = new ArrayList<>();
        days.add(Arrays.asList("A","B","C"));
        days.add(Arrays.asList("A","D"));
        days.add(Arrays.asList("B","C","E"));

        for (List<String> day : days) {
            for (String s : day) {
                map.put(s, map.get(s) + 1);
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() < 2) {
                System.out.println(e.getKey());
            }
        }
    }
}