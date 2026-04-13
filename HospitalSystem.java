import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        return name.equals(((Patient) o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("A");
        Patient p2 = new Patient("B");

        if (admitted.add(p1)) queue.add(p1);
        if (admitted.add(p2)) queue.add(p2);

        while (!queue.isEmpty()) {
            Patient p = queue.remove();
            history.add(p);
            discharged.push(p);
        }

        if (!discharged.isEmpty()) {
            Patient p = discharged.pop();
            queue.add(p);
        }

        System.out.println(history);
    }
}