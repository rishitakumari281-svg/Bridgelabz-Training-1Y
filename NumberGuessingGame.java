import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Random random = new Random();
    static int low = 1;
    static int high = 100;

    public static int generateGuess() {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getFeedback(Scanner sc) {
        return sc.nextLine().toLowerCase();
    }

    public static void updateRange(int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String feedback = "";

        System.out.println("Think of a number between 1 and 100");

        while (!feedback.equals("correct")) {

            int guess = generateGuess();
            System.out.println("Is it " + guess + "? (high/low/correct)");

            feedback = getFeedback(sc);

            if (!feedback.equals("correct")) {
                updateRange(guess, feedback);
            }
        }

        System.out.println("Yay! I guessed your number.");
    }
}
