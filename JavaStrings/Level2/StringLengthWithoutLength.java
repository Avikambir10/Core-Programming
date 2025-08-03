package JavaStrings.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {
    static int getLength(String s) {
        int count = 0;
        try { while (true) { s.charAt(count++); } }
        catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println("Manual Length: " + getLength(s));
        System.out.println("Built-in Length: " + s.length());
    }
}
