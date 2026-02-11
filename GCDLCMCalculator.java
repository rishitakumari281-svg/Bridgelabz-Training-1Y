import java.util.Scanner;

public class GCDLCMCalculator {

    public static int takeInput(Scanner sc, String message) {
        System.out.println(message);
        return sc.nextInt();
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void displayResult(int gcd, int lcm) {
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        displayResult(gcd, lcm);
    }
}
