class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    double calculateTotalPrice() {
        double extraCharge = 50 * getQuantity();
        return (getPrice() * getQuantity()) + extraCharge;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount: 10%";
    }
}
