import java.util.Scanner;

// Program Name: MeanHeightCalculator
// Purpose: Calculate the average height of 11 football players
class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Input loop
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
            double h = input.nextDouble();

            if (h <= 0) {
                System.out.println("Invalid height. Try again.");
                i--;
                continue;
            }

            heights[i] = h;
            sum += h;
        }

        double mean = sum / heights.length;

        System.out.printf("Average height of the team: %.2f cm\n", mean);

        input.close();
    }
}
