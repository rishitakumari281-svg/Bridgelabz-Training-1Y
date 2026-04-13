import java.util.*;

class Package {
    String id;

    Package(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        Package p1 = new Package("P1");
        Package p2 = new Package("P2");

        if (ids.add(p1.id)) pending.add(p1);
        if (ids.add(p2.id)) pending.add(p2);

        while (!pending.isEmpty()) {
            Package p = pending.remove();
            if (p.id.equals("P2")) {
                returned.push(p);
            } else {
                delivered.add(p);
            }
        }

        System.out.println(delivered);
        System.out.println(returned);
    }
}