import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // c. Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // d. Find the frequency of each digit
        int[] frequency = new int[10]; // array to store frequency of digits 0-9
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++; // increment frequency for that digit
        }

        // e. Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
