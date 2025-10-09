import java.util.Scanner;

// Class to check if a number is an Armstrong number
class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, originalNumber, sum = 0;

        // Input number
        System.out.print("Enter a number: ");
        number = input.nextInt();
        originalNumber = number;

        // Loop to calculate sum of cubes of digits
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }

        // Output result
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number.");
        }

        input.close();
    }
}
