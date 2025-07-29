import java.util.Scanner;

// Program Name: VotingEligibility
// Purpose: Check if each of the 10 students is eligible to vote (age >= 18)
class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            int age = input.nextInt();

            if (age < 0) {
                System.out.println("Invalid age entered. Please enter a positive age.");
                i--; // Repeat input for the same student
                continue;
            }

            ages[i] = age;
        }

        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            if (age >= 18) {
                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
