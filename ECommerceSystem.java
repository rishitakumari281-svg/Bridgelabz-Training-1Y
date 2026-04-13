import java.util.*;

class Order {
    int id;

    Order(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return id == order.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return "Order " + id;
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Set<Order> orderSet = new HashSet<>();
        Queue<Order> queue = new LinkedList<>();
        Stack<Order> failed = new Stack<>();

        orderList.add(new Order(1));
        orderList.add(new Order(2));
        orderList.add(new Order(1));

        orderSet.addAll(orderList);

        queue.addAll(orderSet);

        while (!queue.isEmpty()) {
            Order o = queue.remove();
            if (o.id == 2) {
                failed.push(o);
            } else {
                System.out.println("Processed: " + o);
            }
        }

        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}