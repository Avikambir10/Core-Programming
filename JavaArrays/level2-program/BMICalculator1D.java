import java.util.Scanner;

class BMICalculator1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height (in meters): ");
            height[i] = input.nextDouble();
            System.out.print("Enter weight (in kg): ");
            weight[i] = input.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5)
                status[i] = "Underweight";
            else if (bmi[i] < 24.9)
                status[i] = "Normal";
            else if (bmi[i] < 29.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d - Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                    i + 1, height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}
