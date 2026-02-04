
import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols]; // 2D array

        // Input elements of the 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step b: Create a 1D array of size rows*columns
        int[] array = new int[rows * cols];

        // Step c: Copy 2D array elements to 1D array
        int index = 0; // to keep track of position in 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];
                index++; // increment index for next element
            }
        }

        // Display 1D array
        System.out.println("1D array after copying elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
