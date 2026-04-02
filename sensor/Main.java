import java.util.*;

public class Main {
    public static void addValue(List<Double> list, double val) {
        list.add(val);
    }

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        addValue(list, 25.5);
        Double d = 30.2;
        addValue(list, d);
        System.out.println(list);
    }
}