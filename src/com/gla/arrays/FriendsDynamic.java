import java.util.Scanner;

public class FriendsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxFriends = 3; // initial array size
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[maxFriends];
        double[] heights = new double[maxFriends];

        int friendCount = 0; // number of friends actually entered

        while (friendCount < 3) { // for this question, we have 3 friends
            System.out.println("Enter details for " + friends[friendCount] + ":");

            // Input age
            while (true) {
                System.out.print("Age: ");
                if (sc.hasNextInt()) {
                    int age = sc.nextInt();
                    if (age > 0) {
                        ages[friendCount] = age;
                        break;
                    } else {
                        System.out.println("Age must be positive. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
            }

            // Input height
            while (true) {
                System.out.print("Height (in cm): ");
                if (sc.hasNextDouble()) {
                    double height = sc.nextDouble();
                    if (height > 0) {
                        heights[friendCount] = height;
                        break;
                    } else {
                        System.out.println("Height must be positive. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
            }

            friendCount++;

            // Dynamic resizing hint (not needed here but implemented)
            if (friendCount == maxFriends) {
                maxFriends += 10; // increase array size by 10

                // Resize ages array
                int[] tempAges = new int[maxFriends];
                for (int i = 0; i < ages.length; i++) tempAges[i] = ages[i];
                ages = tempAges;

                // Resize heights array
                double[] tempHeights = new double[maxFriends];
                for (int i = 0; i < heights.length; i++) tempHeights[i] = heights[i];
                heights = tempHeights;

                // Resize friends array
                String[] tempFriends = new String[maxFriends];
                for (int i = 0; i < friends.length; i++) tempFriends[i] = friends[i];
                friends = tempFriends;
            }
        }

        // Find youngest and tallest **only among entered friends**
        int youngestIndex = 0;
        int tallestIndex = 0;
        for (int i = 1; i < friendCount; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }

        // Display results
        System.out.println("\nThe youngest friend is: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
