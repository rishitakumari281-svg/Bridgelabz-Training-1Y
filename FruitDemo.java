class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}

class FruitBox<T extends Fruit> {
    T fruit;

    void add(T fruit) {
        this.fruit = fruit;
    }

    void display() {
        System.out.println(fruit);
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.display();
    }
}