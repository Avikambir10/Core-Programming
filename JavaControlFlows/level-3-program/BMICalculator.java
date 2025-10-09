import java.util.Scanner;

// Class to calculate Body Mass Index (BMI)
class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weightKg, heightCm, heightM, bmi;

        // Input weight and height
        System.out.print("Enter weight (kg): ");
        weightKg = input.nextDouble();

        System.out.print("Enter height (cm): ");
        heightCm = input.nextDouble();

        // Convert cm to meters
        heightM = heightCm / 100;

        // Calculate BMI
        bmi = weightKg / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        // Determine status
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
