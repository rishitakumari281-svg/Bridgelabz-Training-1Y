public class MainDashboard {

    public static void main(String[] args) {

        Vehicle petrol = new PetrolCar();
        Vehicle electric = new ElectricCar();

        petrol.displaySpeed(80);

        electric.displaySpeed(60);
        electric.displayBattery(75);
    }
}