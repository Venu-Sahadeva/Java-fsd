import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        // Input elements of the first matrix
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Input elements of the second matrix
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Check if matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        // Perform matrix multiplication
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Output the result matrix
        System.out.println("Resultant Matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

