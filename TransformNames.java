import java.util.*;
import java.util.stream.*;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rishi", "aman", "neha");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}