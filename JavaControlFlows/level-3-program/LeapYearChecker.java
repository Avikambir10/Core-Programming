import java.util.Scanner;

// Class to check whether a year is a leap year or not
class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare year variable
        int year;

        // Get user input
        System.out.print("Enter a year (>=1582): ");
        year = input.nextInt();

        // Check if year is valid (Gregorian calendar starts from 1582)
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is Not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }

        input.close();
    }
}
