// StudentVoteChecker.java
import java.util.Scanner;

public class StudentVoteChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (canStudentVote(ages[i])) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            } else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }
    }

    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
}
