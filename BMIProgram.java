import java.util.Scanner;

public class BMIProgram {

    static String[] findBMI(double weight, double heightCm) {
        double height = heightCm / 100;
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 40)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] { String.valueOf(bmi), status };
    }

    static String[][] process(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[] bmiData = findBMI(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    static void display(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(
                result[i][0] + "\t\t" +
                result[i][1] + "\t\t" +
                result[i][2] + "\t" +
                result[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] result = process(data);
        display(result);
    }
}