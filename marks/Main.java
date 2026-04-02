import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object[] data = {"85", 95, Integer.valueOf(88), "null"};
        ArrayList<Integer> list = new ArrayList<>();

        for (Object obj : data) {
            try {
                if (obj instanceof Integer) list.add((Integer) obj);
                else if (obj instanceof String && !obj.equals("null"))
                    list.add(Integer.parseInt((String) obj));
            } catch (Exception e) {}
        }

        int sum = 0;
        for (int x : list) sum += x;

        System.out.println((double) sum / list.size());
    }
}