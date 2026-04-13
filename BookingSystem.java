import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    int priority;

    Booking(String user, int priority) {
        this.user = user;
        this.priority = priority;
    }

    public int compareTo(Booking b) {
        return b.priority - this.priority;
    }

    public String toString() {
        return user;
    }
}

public class BookingSystem {
    public static void main(String[] args) {
        List<Booking> all = new ArrayList<>();
        Set<String> users = new HashSet<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> vip = new PriorityQueue<>();

        if (users.add("U1")) queue.add(new Booking("U1",1));
        if (users.add("U2")) queue.add(new Booking("U2",1));

        vip.add(new Booking("VIP1",5));

        while (!vip.isEmpty()) {
            Booking b = vip.remove();
            all.add(b);
        }

        while (!queue.isEmpty()) {
            Booking b = queue.remove();
            all.add(b);
        }

        System.out.println(all);
    }
}