// Java Program to calculate Number of Rounds in a Triangular Park to complete 5 km
import java.util.Scanner;

class TriangularParkRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter; // 5km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = input.nextDouble();
        System.out.print("Enter side 2: ");
        double b = input.nextDouble();
        System.out.print("Enter side 3: ");
        double c = input.nextDouble();
        System.out.printf("Number of rounds to complete 5km: %.2f\n", calculateRounds(a, b, c));
        input.close();
    }
}