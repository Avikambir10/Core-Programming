import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    static void generateException(String text) {
        System.out.println(text.charAt(text.length()));  // Will throw exception
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text); // Uncomment to see unhandled exception
        handleException(text);
    }
}
