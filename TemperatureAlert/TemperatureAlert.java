import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double threshold = 30.0;

        // Predicate to check temperature
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemp = 35.0;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println(" Temperature Alert! Too Hot!");
        } else {
            System.out.println("Temperature is Normal.");
        }
    }
}