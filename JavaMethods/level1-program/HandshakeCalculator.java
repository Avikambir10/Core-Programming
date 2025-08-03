import java.util.Scanner;

// Java Program to calculate maximum handshakes among N students
public class HandshakeCalculator {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate input
        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int totalHandshakes = calculateHandshakes(numberOfStudents);
            System.out.println("Maximum number of handshakes among " + numberOfStudents +
                               " students is: " + totalHandshakes);
        }

        input.close();
    }
}
