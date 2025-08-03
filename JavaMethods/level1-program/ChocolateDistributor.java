import java.util.Scanner;

public class ChocolateDistributor {
    public static int[] distributeChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remain = chocolates % children;
        return new int[]{each, remain};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int children = input.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = distributeChocolates(chocolates, children);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        input.close();
    }
}
