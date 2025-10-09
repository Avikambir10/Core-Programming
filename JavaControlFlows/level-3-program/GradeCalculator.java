import java.util.Scanner;

// Class to calculate percentage and grade from 3 subjects
class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for marks
        int physicsMarks, chemistryMarks, mathsMarks;
        double percentage;

        // Input marks
        System.out.print("Enter marks in Physics: ");
        physicsMarks = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        chemistryMarks = input.nextInt();

        System.out.print("Enter marks in Maths: ");
        mathsMarks = input.nextInt();

        // Calculate percentage
        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        percentage = totalMarks / 3.0;

        // Display percentage
        System.out.println("Average Percentage: " + percentage + "%");

        // Determine grade
        if (percentage >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (percentage >= 75) {
            System.out.println("Grade: A (Very Good)");
        } else if (percentage >= 60) {
            System.out.println("Grade: B (Good)");
        } else if (percentage >= 50) {
            System.out.println("Grade: C (Average)");
        } else if (percentage >= 35) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        input.close();
    }
}
