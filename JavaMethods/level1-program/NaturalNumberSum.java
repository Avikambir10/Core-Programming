import java.util.Scanner;

public class NaturalNumberSum {
    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int sum = sumNaturalNumbers(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        input.close();
    }
}
