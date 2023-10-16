import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user if they want to enter their own matrices or use constants
        System.out.print("Do you want to enter your own matrices? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();

        int rows, cols;

        // Declare matrices
        int[][] matrixA;
        int[][] matrixB;

        if (choice.equals("yes")) {
            // User enters their own matrices
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrixA = new int[rows][cols];
            matrixB = new int[rows][cols];

            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixA[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrixB[i][j] = scanner.nextInt();
                }
            }
        } else {
            // Use constant matrices for demonstration
            rows = 2;
            cols = 2;
            matrixA = new int[][]{{1, 2}, {3, 4}};
            matrixB = new int[][]{{5, 6}, {7, 8}};
        }

        // Add the matrices
        int[][] resultMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print the result
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
