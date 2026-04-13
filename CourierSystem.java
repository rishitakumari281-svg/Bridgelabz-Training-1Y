import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    int priority;

    Parcel(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return id;
    }
}

public class CourierSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priority = new PriorityQueue<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normal = new LinkedList<>();

        Parcel p1 = new Parcel("P1",5);
        Parcel p2 = new Parcel("P2",1);

        if (ids.add(p1.id)) priority.add(p1);
        if (ids.add(p2.id)) normal.add(p2);

        while (!priority.isEmpty()) {
            completed.add(priority.remove());
        }

        while (!normal.isEmpty()) {
            completed.add(normal.remove());
        }

        System.out.println(completed);
    }
}