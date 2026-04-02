import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start, end;

        int[] arr = new int[1000000];
        start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        long sum1 = 0;
        for (int x : arr) sum1 += x;
        end = System.currentTimeMillis();
        System.out.println("int[] time: " + (end - start));

        ArrayList<Integer> list = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) list.add(i);
        long sum2 = 0;
        for (int x : list) sum2 += x;
        end = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (end - start));
    }
}