class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
        b1.set(10);

        Box<String> b2 = new Box<>();
        b2.set("Hello");

        Box<Double> b3 = new Box<>();
        b3.set(3.14);

        System.out.println(b1.get());
        System.out.println(b2.get());
        System.out.println(b3.get());
    }
}