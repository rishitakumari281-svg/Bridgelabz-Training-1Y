import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean weekend;

    Doctor(String name, String specialty, boolean weekend) {
        this.name = name;
        this.specialty = specialty;
        this.weekend = weekend;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> list = Arrays.asList(
            new Doctor("A", "Cardio", true),
            new Doctor("B", "Neuro", false),
            new Doctor("C", "Ortho", true)
        );

        list.stream()
            .filter(d -> d.weekend)
            .sorted((a, b) -> a.specialty.compareTo(b.specialty))
            .forEach(d -> System.out.println(d.name + " " + d.specialty));
    }
}