import java.util.Scanner;

public class SpringSeasonChecker {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4 || month == 5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        if (isSpring(month, day))
            System.out.println("It is Spring Season.");
        else
            System.out.println("Not a Spring Season.");

        input.close();
    }
}
