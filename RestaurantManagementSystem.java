class PersonBase {
    String name;
    int id;

    PersonBase(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends PersonBase implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Cooking food");
    }
}

class Waiter extends PersonBase implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Serving customers");
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker c = new Chef("John", 1);
        c.performDuties();
    }
}
