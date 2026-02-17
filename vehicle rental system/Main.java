import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", 2000));
        vehicles.add(new Bike("B202", 800));
        vehicles.add(new Truck("T303", 5000));

        int days = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance(days);
            }

            double total = rentalCost + insuranceCost;

            System.out.println(v.getType() + " " + v.getVehicleNumber());
            System.out.println("Total Cost: " + total);
            System.out.println("-------------------");
        }
    }
}
