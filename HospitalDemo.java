import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int priority;

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Patient p) {
        return p.priority - this.priority;
    }

    public String toString() {
        return name;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();

        pq.add(new Patient("John",3));
        pq.add(new Patient("Alice",5));
        pq.add(new Patient("Bob",2));

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}