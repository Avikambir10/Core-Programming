import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = input.nextInt();
        if (number < 0) {
            System.err.println("Invalid input. Number must be non-negative.");
        }

        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; number > 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed Number: ");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();

        input.close();
    }
}
