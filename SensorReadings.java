import java.util.*;
import java.util.stream.*;

public class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(20, 55, 70, 30);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}