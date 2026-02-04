import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n > 0) {
                // Create a String array to store results
                String[] results = new String[n];

                // Loop from 1 to n
                for (int i = 1; i <= n; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        results[i - 1] = "FizzBuzz";
                    } else if (i % 3 == 0) {
                        results[i - 1] = "Fizz";
                    } else if (i % 5 == 0) {
                        results[i - 1] = "Buzz";
                    } else {
                        results[i - 1] = String.valueOf(i);
                    }
                }

                // Print results in the required format
                for (int i = 0; i < results.length; i++) {
                    System.out.println("Position " + (i + 1) + " = " + results[i]);
                }

            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        sc.close();
    }
}
