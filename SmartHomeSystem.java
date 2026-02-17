class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println(deviceId + " " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        super.displayStatus();
        System.out.println(temperatureSetting);
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T101", "ON", 22.5);
        t.displayStatus();
    }
}
