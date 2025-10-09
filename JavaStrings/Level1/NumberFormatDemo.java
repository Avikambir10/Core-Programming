import java.util.Scanner;

public class NumberFormatDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // Uncomment to see unhandled exception
        handleException(text);
    }
}
