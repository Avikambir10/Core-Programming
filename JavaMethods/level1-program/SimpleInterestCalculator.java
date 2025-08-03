// Java Program to calculate Simple Interest
import java.util.Scanner;

class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = input.nextDouble();

        double interest = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        input.close();
    }
}
