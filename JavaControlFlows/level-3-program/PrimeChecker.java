import java.util.Scanner;

// Class to check whether a number is prime
class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        boolean isPrime = true;

        // Input number
        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        input.close();
    }
}
