import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

class Electronics {}
class Clothing {}

public class CartDemo {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics());

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing());

        eCart.displayItems();
        cCart.displayItems();
    }
}