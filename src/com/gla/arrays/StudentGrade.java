import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] remark = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            physics[i] = readMarks(sc, "Physics");
            chemistry[i] = readMarks(sc, "Chemistry");
            maths[i] = readMarks(sc, "Maths");

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grade[i] = calculateGrade(percentage[i]);
            remark[i] = calculateRemark(grade[i]);
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("Remark: " + remark[i]);
            System.out.println();
        }

        sc.close();
    }

    // Validate marks
    static int readMarks(Scanner sc, String subject) {
        int marks;
        do {
            System.out.print("Enter " + subject + " marks: ");
            marks = sc.nextInt();
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
            }
        } while (marks < 0);
        return marks;
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
