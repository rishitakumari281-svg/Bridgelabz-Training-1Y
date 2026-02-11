import java.util.Scanner;

public class FactorialRecursion {

    public static int takeInput(Scanner sc) {
        System.out.println("Enter a number: ");
        return sc.nextInt();
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = takeInput(sc);
        long result = factorial(number);
        displayResult(number, result);
    }
}
