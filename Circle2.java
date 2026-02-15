class Circle2 {
    double radius;

    Circle2() {
        this(1.0);
    }

    Circle2(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle2();
        Circle c2 = new Circle2(5);

        c1.display();
        c2.display();
    }
}
