public class EmployeeBonus {

    public static double[][] generateEmployees() {
        double[][] data = new double[10][2]; // salary, years

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random()*90000);
            data[i][1] = 1 + (int)(Math.random()*10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][3]; // old salary, new salary, bonus

        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;

            result[i][0] = salary;
            result[i][1] = salary + bonus;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void main(String[] args) {

        double[][] employees = generateEmployees();
        double[][] result = calculateBonus(employees);

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Old\tNew\tBonus");

        for (int i = 0; i < 10; i++) {
            totalOld += result[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][2];

            System.out.println(result[i][0] + "\t" +
                               result[i][1] + "\t" +
                               result[i][2]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
        System.out.println("Total Bonus: " + totalBonus);
    }
}
