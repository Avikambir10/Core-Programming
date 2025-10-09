import java.util.Scanner;

class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend is " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend is " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}
