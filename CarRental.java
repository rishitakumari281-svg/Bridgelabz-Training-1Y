class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateTotalCost() {
        return rentalDays * ratePerDay;
    }
}
