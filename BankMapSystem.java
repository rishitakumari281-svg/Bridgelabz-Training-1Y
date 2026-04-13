import java.util.*;

public class BankMapSystem {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("A1", 5000.0);
        map.put("A2", 10000.0);
        map.put("A3", 7000.0);
        map.put("A4", 20000.0);
        map.put("A5", 15000.0);

        String acc = "A1";
        double deposit = 2000;
        map.put(acc, map.get(acc) + deposit);

        double withdraw = 3000;
        if (map.get(acc) >= withdraw) {
            map.put(acc, map.get(acc) - withdraw);
        }

        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println("Top: " + list.get(i).getKey());
        }
    }
}