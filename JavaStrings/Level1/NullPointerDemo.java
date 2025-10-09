public class NullPointerDemo {
    @SuppressWarnings("null")
    static void generateException() {
        String text = null;
        System.out.println(text.length());  // This will throw NullPointerException
    }

    @SuppressWarnings("null")
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see exception without handling
        handleException();
    }
}
