import java.util.Scanner;

// Program Name: EmployeeBonusCalculator
// Purpose: Calculate bonus and new salary of 10 employees based on years of service
class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int TOTAL_EMPLOYEES = 10;
        final double BONUS_MORE_THAN_5_YEARS = 0.05;
        final double BONUS_5_OR_LESS_YEARS = 0.02;

        double[] salary = new double[TOTAL_EMPLOYEES];
        double[] yearsOfService = new double[TOTAL_EMPLOYEES];
        double[] bonus = new double[TOTAL_EMPLOYEES];
        double[] newSalary = new double[TOTAL_EMPLOYEES];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salaries and years of service
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            // Take salary input and validate
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();
            if (salary[i] <= 0) {
                System.err.println("Invalid salary. Please re-enter.");
                i--; // Decrement index to retry
                continue;
            }

            // Take years of service input and validate
            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();
            if (yearsOfService[i] < 0) {
                System.err.println("Invalid years of service. Please re-enter.");
                i--; // Decrement index to retry
                continue;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * BONUS_MORE_THAN_5_YEARS;
            } else {
                bonus[i] = salary[i] * BONUS_5_OR_LESS_YEARS;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output summary
        System.out.println("\n===== Bonus Report for All Employees =====");
        for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = ₹%.2f, Bonus = ₹%.2f, New Salary = ₹%.2f\n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        // Output totals
        System.out.println("\n===== Summary =====");
        System.out.printf("Total Bonus Paid by Zara: ₹%.2f\n", totalBonus);
        System.out.printf("Total Old Salary of All Employees: ₹%.2f\n", totalOldSalary);
        System.out.printf("Total New Salary of All Employees: ₹%.2f\n", totalNewSalary);

        input.close();
    }
}
