import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long number;
        while (true) {
            if (sc.hasNextLong()) {
                number = sc.nextLong();
                if (number > 0) {
                    break;
                } else {
                    System.out.print("Number must be positive. Enter again: ");
                }
            } else {
                System.out.print("Invalid input. Enter a number: ");
                sc.next(); // clear invalid input
            }
        }

        int maxDigit = 10; // max digits allowed
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            int digit = (int)(number % 10); // get last digit
            digits[index] = digit;
            index++;
            number /= 10; // remove last digit

            if (index == maxDigit) {
                break; // stop if array is full
            }
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
