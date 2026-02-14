import java.util.Scanner;
import java.util.Random;

public class StudentScoreCard {

    public static int[][] generateMarks(int n) {
        Random r = new Random();
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + r.nextInt(90);
            }
        }
        return marks;
    }

    public static double[][] calculateResult(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void display(int[][] marks, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t" +
                    marks[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    getGrade(result[i][2])
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateResult(marks);

        display(marks, result);
    }
}