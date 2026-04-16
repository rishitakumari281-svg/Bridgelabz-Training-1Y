import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaims {
    public static void main(String[] args) {
        List<Claim> list = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Health", 7000),
            new Claim("Auto", 3000),
            new Claim("Auto", 4000)
        );

        Map<String, Double> result =
            list.stream().collect(Collectors.groupingBy(
                c -> c.type,
                Collectors.averagingDouble(c -> c.amount)
            ));

        System.out.println(result);
    }
}