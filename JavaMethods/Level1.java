package JavaMethods;

import java.util.*;

public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        simpleInterest(sc);
        maxHandshakes(sc);
        triangularParkRounds(sc);
        checkNumberSign(sc);
        springSeason(sc);
        sumOfNaturalNumbers(sc);
        smallestAndLargest(sc);
        quotientAndRemainder(sc);
        chocolateDistribution(sc);
        windChillTemperature(sc);
        trigonometricFunctions(sc);
    }

    public static void simpleInterest(Scanner sc) {
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate
                + " and Time " + time);
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void maxHandshakes(Scanner sc) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes = " + handshakes);
    }

    public static void triangularParkRounds(Scanner sc) {
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to run " + rounds + " rounds to complete 5 km.");
    }

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return Math.ceil(5000 / perimeter);
    }

    public static void checkNumberSign(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = getSign(num);
        System.out.println("Result = " + result);
    }

    public static int getSign(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    public static void springSeason(Scanner sc) {
        System.out.print("Enter Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Day: ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }

    public static void sumOfNaturalNumbers(Scanner sc) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }

    public static void smallestAndLargest(Scanner sc) {
        System.out.print("Enter number1: ");
        int a = sc.nextInt();
        System.out.print("Enter number2: ");
        int b = sc.nextInt();
        System.out.print("Enter number3: ");
        int c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest = " + result[0] + ", Largest = " + result[1]);
    }

    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = a;
        int largest = a;

        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;

        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        return new int[] { smallest, largest };
    }

    public static void quotientAndRemainder(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, divisor);
        System.out.println("Quotient = " + result[1] + ", Remainder = " + result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] { remainder, quotient };
    }

    public static void chocolateDistribution(Scanner sc) {
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[1] + " chocolates and Remaining chocolates = " + result[0]);
    }

    public static void windChillTemperature(Scanner sc) {
        System.out.print("Enter Temperature (F): ");
        double temp = sc.nextDouble();
        System.out.print("Enter Wind Speed (mph): ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temp, windSpeed);
        System.out.println("Wind Chill Temperature = " + windChill);
    }

    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void trigonometricFunctions(Scanner sc) {
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + trigValues[0]);
        System.out.println("Cosine = " + trigValues[1]);
        System.out.println("Tangent = " + trigValues[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }
}
