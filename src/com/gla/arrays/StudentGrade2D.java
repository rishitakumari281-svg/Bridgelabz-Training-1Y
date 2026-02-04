import java.util.Scanner;

public class StudentGrade2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];   // 2D array for marks
        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] remark = new String[n];

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0)
                        System.out.print("Enter Physics marks: ");
                    else if (j == 1)
                        System.out.print("Enter Chemistry marks: ");
                    else
                        System.out.print("Enter Maths marks: ");

                    marks[i][j] = sc.nextInt();

                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative. Enter again.");
                    }
                } while (marks[i][j] < 0);
            }

            // Calculate percentage using 2D array
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grade[i] = calculateGrade(percentage[i]);
            remark[i] = calculateRemark(grade[i]);
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("Remark: " + remark[i]);
            System.out.println();
        }

        sc.close();
    }

    // Grade calculation
    static char calculateGrade(double percent) {
        if (percent >= 80)
            return 'A';
        else if (percent >= 70)
            return 'B';
        else if (percent >= 60)
            return 'C';
        else if (percent >= 50)
            return 'D';
        else if (percent >= 40)
            return 'E';
        else
            return 'R';
    }

    // Remark calculation
    static String calculateRemark(char grade) {
        switch (grade) {
            case 'A':
                return "Level 4, above agency-normalized standards";
            case 'B':
                return "Level 3, at agency-normalized standards";
            case 'C':
                return "Level 2, below but approaching agency-normalized standards";
            case 'D':
                return "Level 1, well below agency-normalized standards";
            case 'E':
                return "Level 1, too below agency-normalized standards";
            default:
                return "Remedial standards";
        }
    }
}