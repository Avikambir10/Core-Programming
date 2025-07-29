import java.util.Scanner;

// Class to check if a number is an Abundant number
class AbundantChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Sum of all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check for Abundant
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        input.close();
    }
}
