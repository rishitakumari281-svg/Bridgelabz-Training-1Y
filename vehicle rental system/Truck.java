class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return 800 * days;
    }

    public String getInsuranceDetails() {
        return "Truck Insurance: 800 per day";
    }
}
