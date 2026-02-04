import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            while (true) {
                if (sc.hasNextInt()) {
                    int age = sc.nextInt();
                    if (age > 0) {
                        ages[i] = age;
                        break;
                    } else {
                        System.out.print("Age must be positive. Enter again: ");
                    }
                } else {
                    System.out.print("Invalid input. Enter a number: ");
                    sc.next(); // clear invalid input
                }
            }

            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            while (true) {
                if (sc.hasNextDouble()) {
                    double height = sc.nextDouble();
                    if (height > 0) {
                        heights[i] = height;
                        break;
                    } else {
                        System.out.print("Height must be positive. Enter again: ");
                    }
                } else {
                    System.out.print("Invalid input. Enter a number: ");
                    sc.next(); // clear invalid input
                }
            }
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}

