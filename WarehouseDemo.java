import java.util.*;

abstract class WarehouseItem {}

class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }
}

public class WarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> s = new Storage<>();
        s.addItem(new Electronics());

        s.displayItems(s.items);
    }
}