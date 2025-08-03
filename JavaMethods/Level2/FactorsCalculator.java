
import java.util.Scanner;

public class FactorsCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) System.out.print(factor + " ");
        System.out.println();

        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumSquareFactors(factors));
        sc.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }

    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }

    public static int sumSquareFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor * factor;
        return sum;
    }
    
}
