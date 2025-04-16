import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];

              System.out.println("Enter elements of Matrix 1 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "] of Matrix 1: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

               System.out.println("Enter elements of Matrix 2 (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "] of Matrix 2: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

             System.out.println("\nChoose an operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Matrix Transpose (for Matrix 1)");
        System.out.println("4. Matrix Transpose (for Matrix 2)");

                int choice = scanner.nextInt();

              switch (choice) {
            case 1: // Matrix Addition
                System.out.println("\nMatrix 1 + Matrix 2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                displayMatrix(result);
                break;

            case 2:                 System.out.println("\nMatrix 1 * Matrix 2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
                    }
                }
                displayMatrix(result);
                break;

            case 3:                 System.out.println("\nTranspose of Matrix 1:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[j][i];
                    }
                }
                displayMatrix(result);
                break;

            case 4:
                System.out.println("\nTranspose of Matrix 2:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix2[j][i];
                    }
                }
                displayMatrix(result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        
        scanner.close();
    }

   
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
