import java.util.Random;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random 0–9
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    public static int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A = createRandomMatrix(2, 2);
        int[][] B = createRandomMatrix(2, 2);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("Addition:");
        displayMatrix(addMatrix(A, B));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrix(A, B));

        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrix(A, B));
    }
}
