import java.util.Random;

public class AdvancedMatrixOperations {

    public static int[][] createRandomMatrix(int n) {
        Random rand = new Random();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rand.nextInt(5) + 1;

        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static double[][] transpose(int[][] matrix) {
        int n = matrix.length;
        double[][] result = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    public static double determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static double determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] =  m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] =  m[0][0] / det;

        return inv;
    }

    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix(2);

        System.out.println("Matrix:");
        displayMatrix(transpose(matrix));

        System.out.println("Determinant:");
        System.out.println(determinant2x2(matrix));

        System.out.println("\nInverse:");
        displayMatrix(inverse2x2(matrix));
    }
}
