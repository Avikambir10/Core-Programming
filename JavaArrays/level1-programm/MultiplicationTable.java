import java.util.Scanner;

// Program Name: MultiplicationTable
// Purpose: Display multiplication table (1 to 10) for a number using array
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to display its multiplication table: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input. Enter a positive number.");
            System.exit(0);
        }

        int[] table = new int[10];

        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1); // index 0 = number * 1, ..., index 9 = number * 10
        }

        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
