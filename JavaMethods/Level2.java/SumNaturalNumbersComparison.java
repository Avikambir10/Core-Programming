import java.util.Scanner;

public class SumNaturalNumbersComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Input");
        }

        int recursiveSum = findSumRecursive(n);
        int formulaSum = findSumFormula(n);
        sc.close();

        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Formula Sum: " + formulaSum);

        System.out.println(recursiveSum == formulaSum ? "Both sums are equal." : "Sums are not equal.");
    }

    public static int findSumRecursive(int n) {
        if (n == 1) return 1;
        return n + findSumRecursive(n - 1);
    }

    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
