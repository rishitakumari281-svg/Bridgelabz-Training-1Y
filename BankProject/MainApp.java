import com.bank.util.InterestCalculator;

public class MainApp {

    public static void main(String[] args) {

        InterestCalculator calc = new InterestCalculator();

        double principal = 10000;
        double rate = 5;
        double time = 2;

        double si = calc.calculateSimpleInterest(principal, rate, time);
        double ci = calc.calculateCompoundInterest(principal, rate, time);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}