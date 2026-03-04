public interface Vehicle {

    void displaySpeed(int speed);

    default void displayBattery(int percentage) {
        System.out.println("Battery: " + percentage + "%");
    }
}