import java.util.Scanner;

// Program Name: Table6to9
// Purpose: Print multiplication table of a number from 6 to 9 using array
class Table6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }

        int[] multiplicationResult = new int[4]; // For 6, 7, 8, 9

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6); // i=0 → 6, i=1 → 7...
        }

        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
