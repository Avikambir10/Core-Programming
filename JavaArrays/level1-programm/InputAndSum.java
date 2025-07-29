import java.util.Scanner;

// Program Name: InputAndSum
// Purpose: Store up to 10 positive values or until 0/negative is entered and display the sum
class InputAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare array of size 10
        double[] values = new double[10];
        int index = 0; // To track how many numbers entered
        double total = 0.0; // To store sum

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        // Infinite loop for input
        while (true) {
            if (index == 10) {
                System.out.println("Maximum limit of 10 values reached.");
                break;
            }

            System.out.print("Enter value " + (index + 1) + ": ");
            double value = input.nextDouble();

            // Break on zero or negative
            if (value <= 0) {
                System.out.println("Stopping input due to zero or negative entry.");
                break;
            }

            // Store value and update sum
            values[index] = value;
            total += value;
            index++;
        }

        // Display all entered values
        System.out.println("\nEntered Values:");
        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + ": " + values[i]);
        }

        // Display total sum
        System.out.println("Total Sum = " + total);

        input.close();
    }
}
