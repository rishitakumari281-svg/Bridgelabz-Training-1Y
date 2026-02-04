import java.util.Scanner;

public class BMICalculator2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; // [weight, height, BMI]
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Input weight with validation
            double weight;
            do {
                System.out.print("Enter weight (kg, positive): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            // Input height with validation (in cm, convert to meters)
            double height;
            do {
                System.out.print("Enter height (cm, positive): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            height = height / 100.0; // convert cm to meters
            personData[i][1] = height;
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.printf("\n%-12s %-12s %-8s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-12.2f %-12.2f %-8.2f %-15s\n",
                    personData[i][1] * 100, // convert back to cm for display
                    personData[i][0],
                    personData[i][2],
                    weightStatus[i]);
        }

        sc.close();
    }
}