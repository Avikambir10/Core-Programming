package JavaControlFlows;
import java.util.Scanner;

public class Level1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        isDivisibleBy5(input);
        isFirstSmallest(input);
        findLargest(input);
        sumOfNaturalNumbers(input);
        checkVotingEligibility(input);
        numberSignCheck(input);
        springSeasonCheck(input);
        rocketCountdownWhile(input);
        rocketCountdownFor(input);
        sumUntilZero(input);
        sumUntilZeroOrNegative(input);
        sumNaturalNumbersWhile(input);
        sumNaturalNumbersFor(input);
        factorialWhile(input);
        factorialFor(input);

        input.close();
    }

    // 1. Divisible by 5
    public static void isDivisibleBy5(Scanner input) {
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();
        boolean divisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + divisible);
    }

    // 2. First number smallest?
    public static void isFirstSmallest(Scanner input) {
        System.out.print("\nEnter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        boolean isSmallest = (num1 <= num2 && num1 <= num3);
        System.out.println("Is the first number the smallest? " + isSmallest);
    }

    // 3. Which number is largest?
    public static void findLargest(Scanner input) {
        System.out.print("\nEnter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        boolean isFirstLargest = (num1 >= num2 && num1 >= num3);
        boolean isSecondLargest = (num2 >= num1 && num2 >= num3);
        boolean isThirdLargest = (num3 >= num1 && num3 >= num2);

        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }

    // 4. Sum of n Natural Numbers
    public static void sumOfNaturalNumbers(Scanner input) {
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();
        if (n >= 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting Eligibility
    public static void checkVotingEligibility(Scanner input) {
        System.out.print("\nEnter age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }

    // 6. Positive, Negative, Zero
    public static void numberSignCheck(Scanner input) {
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    // 7. Spring Season Checker
    public static void springSeasonCheck(Scanner input) {
        System.out.print("\nEnter month (as integer 1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();

        boolean isSpring = ( (month == 3 && day >= 20) ||
                             (month == 6 && day <= 20) ||
                             (month > 3 && month < 6) );

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // 8. Rocket Countdown using while loop
    public static void rocketCountdownWhile(Scanner input) {
        System.out.print("\nEnter countdown start number: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch!");
    }

    // 9. Rocket Countdown using for loop
    public static void rocketCountdownFor(Scanner input) {
        System.out.print("\nEnter countdown start number: ");
        int counter = input.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Launch!");
    }

    // 10. Sum until user enters 0
    public static void sumUntilZero(Scanner input) {
        double total = 0.0;
        while (true) {
            System.out.print("\nEnter a number (0 to stop): ");
            double number = input.nextDouble();
            if (number == 0) break;
            total += number;
        }
        System.out.println("The total sum is " + total);
    }

    // 11. Sum until user enters 0 or negative number
    public static void sumUntilZeroOrNegative(Scanner input) {
        double total = 0.0;
        while (true) {
            System.out.print("\nEnter a number (0 or negative to stop): ");
            double number = input.nextDouble();
            if (number <= 0) break;
            total += number;
        }
        System.out.println("The total sum is " + total);
    }

    // 12. Sum of n Natural Numbers using while loop
    public static void sumNaturalNumbersWhile(Scanner input) {
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int i = 1, sum = 0;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum + ", Sum using formula: " + formulaSum);
        } else {
            System.out.println("Not a Natural Number");
        }
    }

    // 13. Sum of n Natural Numbers using for loop
    public static void sumNaturalNumbersFor(Scanner input) {
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sum + ", Sum using formula: " + formulaSum);
        } else {
            System.out.println("Not a Natural Number");
        }
    }

    // 14. Factorial using while loop
    public static void factorialWhile(Scanner input) {
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial not defined for negative numbers");
        }
    }

    // 15. Factorial using for loop
    public static void factorialFor(Scanner input) {
        System.out.print("\nEnter a number: ");
        int n = input.nextInt();

        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("Factorial not defined for negative numbers");
        }
    }
}
