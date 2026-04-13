import java.util.*;

public class FeedbackSystem {
    public static void main(String[] args) {
        List<String> feedbacks = new ArrayList<>();
        Set<String> unique = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Stack<String> recent = new Stack<>();

        feedbacks.add("Good");
        feedbacks.add("Bad");
        feedbacks.add("Good");

        unique.addAll(feedbacks);

        queue.addAll(unique);

        while (!queue.isEmpty()) {
            String f = queue.remove();
            recent.push(f);
        }

        System.out.println(recent);
    }
}