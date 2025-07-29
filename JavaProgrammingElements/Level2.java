package JavaProgrammingElements;

import java.util.*;

public class Level2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        basicCalculator(input);
        triangleArea(input);
        squareSideFromPerimeter(input);
        feetToYardsMiles(input);
        totalPurchasePrice(input);
        quotientAndRemainder(input);
        integerOperations(input);
        doubleOperations(input);

        input.close();
    }

    // 1. Basic Calculator
    public static void basicCalculator(Scanner input) {
        System.out.print("\nEnter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1
                + " and " + number2 +
                " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }

    // 2. Area of Triangle in cm^2 and in^2
    public static void triangleArea(Scanner input) {
        System.out.print("\nEnter base of triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }

    // 3. Side of Square from Perimeter
    public static void squareSideFromPerimeter(Scanner input) {
        System.out.print("\nEnter perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    // 4. Feet to Yards and Miles
    public static void feetToYardsMiles(Scanner input) {
        System.out.print("\nEnter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }

    // 5. Total Purchase Price
    public static void totalPurchasePrice(Scanner input) {
        System.out.print("\nEnter unit price (INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);
    }

    // 6. Quotient and Remainder
    public static void quotientAndRemainder(Scanner input) {
        System.out.print("\nEnter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers "
                + number1 + " and " + number2);
    }

    // 7. Integer Operations (IntOperation)
    public static void integerOperations(Scanner input) {
        System.out.print("\nEnter integer a: ");
        int a = input.nextInt();
        System.out.print("Enter integer b: ");
        int b = input.nextInt();
        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        int op1 = a + b * c;
        int op2 = a * b + c;
        int op3 = c + a / b;
        int op4 = a % b + c;

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }

    // 8. Double Operations (DoubleOpt)
    public static void doubleOperations(Scanner input) {
        System.out.print("\nEnter double a: ");
        double a = input.nextDouble();
        System.out.print("Enter double b: ");
        double b = input.nextDouble();
        System.out.print("Enter double c: ");
        double c = input.nextDouble();

        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = a % b + c;

        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
    }
}
