import java.util.Random;

public class ScoreCard {

    static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                pcm[i][j] = r.nextInt(90) + 10;
            }
        }
        return pcm;
    }

    static double[][] calculateResults(int[][] pcm) {
        double[][] result = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = Math.round((total / 300.0) * 100 * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }

    static char calculateGrade(double percent) {
        if (percent >= 80) return 'A';
        else if (percent >= 70) return 'B';
        else if (percent >= 60) return 'C';
        else if (percent >= 50) return 'D';
        else if (percent >= 40) return 'E';
        else return 'R';
    }

    static void display(int[][] pcm, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < pcm.length; i++) {
            System.out.print(pcm[i][0] + "\t" + pcm[i][1] + "\t" + pcm[i][2] + "\t");
            System.out.print((int) result[i][0] + "\t");
            System.out.print(String.format("%.2f", result[i][1]) + "\t");
            System.out.print(result[i][2] + "\t");
            System.out.println(calculateGrade(result[i][2]));
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] pcm = generateScores(students);
        double[][] result = calculateResults(pcm);
        display(pcm, result);
    }
}