import java.util.*;

public class InvertMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A",1);
        input.put("B",2);
        input.put("C",1);

        Map<Integer, List<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> e : input.entrySet()) {
            result.putIfAbsent(e.getValue(), new ArrayList<>());
            result.get(e.getValue()).add(e.getKey());
        }

        System.out.println(result);
    }
}