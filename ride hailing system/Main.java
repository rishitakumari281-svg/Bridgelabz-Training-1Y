import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<RideVehicle> rides = new ArrayList<>();

        Car c = new Car("C1", "Ramesh", 15);
        Bike b = new Bike("B1", "Suresh", 8);
        Auto a = new Auto("A1", "Mahesh", 10);

        c.updateLocation("City Center");
        b.updateLocation("Railway Station");
        a.updateLocation("Bus Stand");

        rides.add(c);
        rides.add(b);
        rides.add(a);

        double distance = 10;

        for (RideVehicle r : rides) {

            r.getVehicleDetails();
            System.out.println("Fare: " + r.calculateFare(distance));

            if (r instanceof GPS) {
                System.out.println("Location: " + ((GPS) r).getCurrentLocation());
            }

            System.out.println("-------------------");
        }
    }
}
