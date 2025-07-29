import java.util.Scanner;

// Class to check if a number is a Harshad number
class HarshadChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        int originalNumber = number;

        // Calculate sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // Check for Harshad
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        input.close();
    }
}
