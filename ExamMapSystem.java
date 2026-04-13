import java.util.*;

public class ExamMapSystem {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> map = new HashMap<>();

        Map<String, Integer> math = new HashMap<>();
        math.put("A", 95);
        math.put("B", 85);

        Map<String, Integer> sci = new HashMap<>();
        sci.put("A", 88);
        sci.put("B", 92);

        map.put("Math", math);
        map.put("Science", sci);

        for (Map.Entry<String, Map<String, Integer>> e : map.entrySet()) {
            String subject = e.getKey();
            Map<String, Integer> marks = e.getValue();

            String top = null;
            int max = 0;
            int sum = 0;

            for (Map.Entry<String, Integer> m : marks.entrySet()) {
                sum += m.getValue();
                if (m.getValue() > max) {
                    max = m.getValue();
                    top = m.getKey();
                }
            }

            System.out.println(subject + " Topper: " + top);
            System.out.println(subject + " Avg: " + (sum / marks.size()));

            for (int v : marks.values()) {
                if (v > 90) {
                    System.out.println(subject + " has >90");
                    break;
                }
            }
        }
    }
}