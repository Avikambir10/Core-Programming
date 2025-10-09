import java.util.Scanner;

// Program Name: OddEvenSeparator
// Purpose: Save odd and even numbers from 1 to N in separate arrays
class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (greater than 0): ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input. Must be a natural number.");
            System.exit(0);
        }

        int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        // Display odd numbers
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Display even numbers
        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        input.close();
    }
}
