import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input for a number
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

        // d. Create an array to store the elements of the digits array in reverse order
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // e. Finally, display the elements of the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        sc.close();
    }
}
