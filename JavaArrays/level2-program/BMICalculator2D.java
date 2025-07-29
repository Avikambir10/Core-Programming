import java.util.*;
// 3. BMI Calculator using 2D Array
class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3]; // 0 - height, 1 - weight, 2 - BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter height in meters: ");
            double height = input.nextDouble();
            if (height <= 0) { System.err.println("Invalid height."); i--; continue; }

            System.out.print("Enter weight in kg: ");
            double weight = input.nextDouble();
            if (weight <= 0) { System.err.println("Invalid weight."); i--; continue; }

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height);

            double bmi = personData[i][2];
            if (bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if (bmi < 25)
                weightStatus[i] = "Normal";
            else if (bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Results ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d => Height: %.2f m, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}
