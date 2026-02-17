class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance(int days) {
        return 500 * days;
    }

    public String getInsuranceDetails() {
        return "Car Insurance: 500 per day";
    }
}
