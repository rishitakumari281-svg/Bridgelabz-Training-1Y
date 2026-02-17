class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
