import java.util.*;

public class ReverseQueueDemo {
    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.remove());
        while (!stack.isEmpty()) q.add(stack.pop());
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println(reverseQueue(q));
    }
}