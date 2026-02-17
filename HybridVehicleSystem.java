class VehicleBase {
    int maxSpeed;
    String model;

    VehicleBase(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends VehicleBase {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println("Charging vehicle");
    }
}

class PetrolVehicle extends VehicleBase implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Refueling vehicle");
    }
}

public class HybridVehicleSystem {
    public static void main(String[] args) {
        PetrolVehicle p = new PetrolVehicle(180, "Sedan");
        p.refuel();
    }
}
