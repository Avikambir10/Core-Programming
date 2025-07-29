import java.util.Scanner;

// Class to check leap year using single if with logical operators
class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Enter a year (>=1582): ");
        year = input.nextInt();

        // Single if condition with logical operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        input.close();
    }
}
