import java.util.*;

public class NthFromEndDemo {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        int slow = 0, fast = 0;

        while (fast < n) fast++;

        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));

        System.out.println(findNthFromEnd(list, 2));
    }
}