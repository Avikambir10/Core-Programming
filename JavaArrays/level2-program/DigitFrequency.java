import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.err.println("Invalid input. Number must be non-negative.");
            return;
        }

        int[] frequency = new int[10];
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0)
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
        }

        input.close();
    }
}
