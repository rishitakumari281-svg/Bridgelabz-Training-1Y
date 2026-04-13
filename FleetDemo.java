import java.util.*;

class Vehicle {}
class Truck extends Vehicle {}
class Bike extends Vehicle {}

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();

    void addVehicle(T v) {
        fleet.add(v);
    }

    void showFleet() {
        for (T v : fleet) {
            System.out.println(v);
        }
    }
}

public class FleetDemo {
    public static void main(String[] args) {
        FleetManager<Truck> trucks = new FleetManager<>();
        trucks.addVehicle(new Truck());

        FleetManager<Bike> bikes = new FleetManager<>();
        bikes.addVehicle(new Bike());

        trucks.showFleet();
        bikes.showFleet();
    }
}