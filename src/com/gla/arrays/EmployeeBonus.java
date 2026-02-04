import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_EMPLOYEES = 10;
        double[] salaries = new double[NUM_EMPLOYEES];       // old salaries
        double[] yearsOfService = new double[NUM_EMPLOYEES]; // years of service
        double[] bonuses = new double[NUM_EMPLOYEES];       // bonus amounts
        double[] newSalaries = new double[NUM_EMPLOYEES];   // new salaries

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // Input loop for salary and years of service
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Input salary
            while (true) {
                System.out.print("Salary: ");
                if (sc.hasNextDouble()) {
                    double salary = sc.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        break;
                    } else {
                        System.out.println("Salary must be positive. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next(); // clear invalid input
                }
            }

            // Input years of service
            while (true) {
                System.out.print("Years of Service: ");
                if (sc.hasNextDouble()) {
                    double years = sc.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        break;
                    } else {
                        System.out.println("Years of service cannot be negative. Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next(); // clear invalid input
                }
            }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        // Print results
        System.out.println("\nEmployee Details:");
        System.out.println("Emp\tOld Salary\tBonus\tNew Salary\tYears of Service");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t%.2f\t\t%.1f\n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i], yearsOfService[i]);
        }

        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

        sc.close();
    }
}
