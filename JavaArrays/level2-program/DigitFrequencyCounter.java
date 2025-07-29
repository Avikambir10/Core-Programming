import java.util.*;
class DigitFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid number. Please enter a non-negative number.");
            System.exit(0);
        }

        int[] digits = new int[10]; // Frequency array for digits 0-9

        while (number > 0) {
            int digit = number % 10;
            digits[digit]++;
            number /= 10;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0)
                System.out.println("Digit " + i + ": " + digits[i] + " times");
        }

        input.close();
    }
}
