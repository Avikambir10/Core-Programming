import java.util.Scanner;

// Program Name: FactorFinder
// Purpose: Find and store factors of a number in an array with dynamic resizing
class FactorFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input. Must be positive.");
            System.exit(0);
        }

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize if needed
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
