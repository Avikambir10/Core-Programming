package JavaControlFlows;

import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printOddEven(input);
        employeeBonus(input);
        multiplicationTable(input);
        fizzBuzzFor(input);
        fizzBuzzWhile(input);
        youngestAndTallest(input);
        factorsForLoop(input);
        factorsWhileLoop(input);
        greatestFactorForLoop(input);
        greatestFactorWhileLoop(input);
        multiplesBelow100ForLoop(input);
        multiplesBelow100WhileLoop(input);
        powerOfNumberForLoop(input);
        powerOfNumberWhileLoop(input);

        input.close();
    }

    // 1. Print Odd and Even Numbers
    public static void printOddEven(Scanner input) {
        System.out.print("\nEnter a natural number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
    }

    // 2. Employee Bonus
    public static void employeeBonus(Scanner input) {
        System.out.print("\nEnter Salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus.");
        }
    }

    // 3. Multiplication Table from 6 to 9
    public static void multiplicationTable(Scanner input) {
        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    // 4. FizzBuzz using For Loop
    public static void fizzBuzzFor(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    // 5. FizzBuzz using While Loop
    public static void fizzBuzzWhile(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }

    // 6. Youngest and Tallest Among Friends
    public static void youngestAndTallest(Scanner input) {
        System.out.print("\nEnter age of Amar: ");
        int age1 = input.nextInt();
        System.out.print("Enter height of Amar: ");
        int height1 = input.nextInt();

        System.out.print("Enter age of Akbar: ");
        int age2 = input.nextInt();
        System.out.print("Enter height of Akbar: ");
        int height2 = input.nextInt();

        System.out.print("Enter age of Anthony: ");
        int age3 = input.nextInt();
        System.out.print("Enter height of Anthony: ");
        int height3 = input.nextInt();

        // Youngest
        if (age1 <= age2 && age1 <= age3)
            System.out.println("Youngest is Amar");
        else if (age2 <= age1 && age2 <= age3)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        // Tallest
        if (height1 >= height2 && height1 >= height3)
            System.out.println("Tallest is Amar");
        else if (height2 >= height1 && height2 >= height3)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");
    }

    // 7. Factors using For Loop
    public static void factorsForLoop(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        System.out.print("Factors: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // 8. Factors using While Loop
    public static void factorsWhileLoop(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        int i = 1;
        System.out.print("Factors: ");
        while (i < number) {
            if (number % i == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    // 9. Greatest Factor (besides itself) using For Loop
    public static void greatestFactorForLoop(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest Factor (beside itself) is: " + greatestFactor);
    }

    // 10. Greatest Factor (besides itself) using While Loop
    public static void greatestFactorWhileLoop(Scanner input) {
        System.out.print("\nEnter a positive integer: ");
        int number = input.nextInt();
        int counter = number - 1;
        int greatestFactor = 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest Factor (beside itself) is: " + greatestFactor);
    }

    // 11. Multiples below 100 using For Loop
    public static void multiplesBelow100ForLoop(Scanner input) {
        System.out.print("\nEnter a number (positive & < 100): ");
        int number = input.nextInt();
        System.out.println("Multiples of " + number + " below 100:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    // 12. Multiples below 100 using While Loop
    public static void multiplesBelow100WhileLoop(Scanner input) {
        System.out.print("\nEnter a number (positive & < 100): ");
        int number = input.nextInt();
        int counter = 100;
        System.out.println("Multiples of " + number + " below 100:");
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.print(counter + " ");
            counter--;
        }
        System.out.println();
    }

    // 13. Power of a Number using For Loop
    public static void powerOfNumberForLoop(Scanner input) {
        System.out.print("\nEnter base number: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to power " + power + " is: " + result);
    }

    // 14. Power of a Number using While Loop
    public static void powerOfNumberWhileLoop(Scanner input) {
        System.out.print("\nEnter base number: ");
        int base = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= base;
            counter++;
        }
        System.out.println(base + " raised to power " + power + " is: " + result);
    }
}
