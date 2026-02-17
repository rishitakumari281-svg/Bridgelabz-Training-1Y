class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return 200 * days;
    }

    public String getInsuranceDetails() {
        return "Bike Insurance: 200 per day";
    }
}
