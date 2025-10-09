import java.util.*;
// Class to determine the day of the week for a given date using Zeller's formula
class DayOfWeekCalculator {
    public static void main(String[] args) {
        // Input via command-line arguments
        if (args.length != 3) {
            System.out.println("Please provide 3 arguments: <month> <day> <year>");
            return;
        }

        // Convert command-line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        // Apply Zeller's congruence formula
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        // Map day number to day name
        String[] dayNames = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Print output
        System.out.println("Date: " + day + "/" + month + "/" + year);
        System.out.println("Day of the week is: " + dayNames[d]);
    }
}
