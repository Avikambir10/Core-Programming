package JavaProgrammingElements;
import java.util.*;

public class Level1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        calculateHarrysAge();
        calculateSamsAverage();
        convertKmToMilesFixed();
        calculateProfitLoss();
        distributePens();
        calculateDiscountFixed();
        computeEarthVolume();
        convertKmToMilesUser(input);
        calculateDiscountUser(input);
        convertHeight(input);

        input.close();
    }

    // 1. Harry's Age
    public static void calculateHarrysAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("\nHarry's age in 2024 is " + age);
    }

    // 2. Sam's Average Marks
    public static void calculateSamsAverage() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }

    // 3. Fixed Kilometers to Miles
    public static void convertKmToMilesFixed() {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // 4. Profit & Profit Percentage
    public static void calculateProfitLoss() {
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    // 5. Pens Distribution
    public static void distributePens() {
        int pens = 14, students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }

    // 6. Discount on Fee (Fixed Values)
    public static void calculateDiscountFixed() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = fee * (discountPercent / 100);
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    // 7. Volume of Earth
    public static void computeEarthVolume() {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }

    // 8. User Input: Kilometers to Miles
    public static void convertKmToMilesUser(Scanner input) {
        System.out.print("\nEnter distance in km: ");
        double userKm = input.nextDouble();
        double userMiles = userKm / 1.6;
        System.out.println("The total miles is " + userMiles + " mile for the given " + userKm + " km");
    }

    // 9. User Input: Discount on Fee
    public static void calculateDiscountUser(Scanner input) {
        System.out.print("\nEnter Student Fee: ");
        double userFee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double userDiscountPercent = input.nextDouble();
        double userDiscount = userFee * (userDiscountPercent / 100);
        double userFinalFee = userFee - userDiscount;
        System.out.println("The discount amount is INR " + userDiscount + " and final discounted fee is INR " + userFinalFee);
    }

    // 10. User Input: Height Conversion
    public static void convertHeight(Scanner input) {
        System.out.print("\nEnter your height in cm: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}

