import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        for (int x : arr) list.add(x);

        int sum = 0, count = 0;

        for (Integer x : list) {
            if (x != null) {
                sum += x;
                count++;
            }
        }

        System.out.println((double) sum / count);
    }
}