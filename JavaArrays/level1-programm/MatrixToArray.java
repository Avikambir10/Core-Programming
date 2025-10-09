import java.util.Scanner;

// Program Name: MatrixToArray
// Purpose: Copy all elements of a 2D array into a 1D array
class MatrixToArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Validate input
        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid input. Rows and columns must be > 0.");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        // Input matrix values
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Copy to 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.println("\n1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
