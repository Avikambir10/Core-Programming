import java.util.*;

// 4. Marks, Percentage and Grade using 2D Array
class StudentMarksGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = input.nextInt();

        int[][] marks = new int[number][3]; // 0 - Physics, 1 - Chemistry, 2 - Maths
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = input.nextInt();
                if (mark < 0 || mark > 100) {
                    System.err.println("Invalid marks for " + subject + ". Please enter again.");
                    j--;
                    continue;
                }
                marks[i][j] = mark;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Assign grade based on percentage
            if (percentages[i] >= 90) grades[i] = "A+";
            else if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d => Physics: %d, Chemistry: %d, Maths: %d, %%: %.2f, Grade: %s\n",
                i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        input.close();
    }
}
