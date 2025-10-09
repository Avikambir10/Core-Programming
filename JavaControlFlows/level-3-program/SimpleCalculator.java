import java.util.Scanner;

// Class to implement basic calculator using switch-case
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first, second, result = 0;
        String operator;

        // Input values
        System.out.print("Enter first number: ");
        first = input.nextDouble();

        System.out.print("Enter second number: ");
        second = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        // Perform operation
        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0)
                    result = first / second;
                else
                    System.out.println("Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}
