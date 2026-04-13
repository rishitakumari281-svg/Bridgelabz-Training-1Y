import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String name;
    int priority;

    RideRequest(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(RideRequest r) {
        return r.priority - this.priority;
    }

    public String toString() {
        return name;
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Ride {
    String info;

    Ride(String info) {
        this.info = info;
    }

    public String toString() {
        return info;
    }
}

public class RideSystem {
    public static void main(String[] args) {
        Queue<RideRequest> normal = new LinkedList<>();
        PriorityQueue<RideRequest> priority = new PriorityQueue<>();
        Set<Driver> drivers = new HashSet<>();
        List<Ride> completed = new ArrayList<>();

        drivers.add(new Driver("D1"));
        drivers.add(new Driver("D2"));

        normal.add(new RideRequest("R1",1));
        priority.add(new RideRequest("VIP",5));

        while (!priority.isEmpty()) {
            RideRequest r = priority.remove();
            completed.add(new Ride(r.name));
            System.out.println("Priority Ride: " + r);
        }

        while (!normal.isEmpty()) {
            RideRequest r = normal.remove();
            completed.add(new Ride(r.name));
            System.out.println("Normal Ride: " + r);
        }

        System.out.println(completed);
    }
}