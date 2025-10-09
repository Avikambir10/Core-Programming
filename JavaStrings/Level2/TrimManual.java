package JavaStrings.Level2;

import java.util.Scanner;

public class TrimManual {
    static String manualTrim(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        String res = "";
        for (int i = start; i <= end; i++) res += s.charAt(i);
        return res;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String manual = manualTrim(s), builtin = s.trim();
        System.out.println("Equal to Built-in Trim: " + compare(manual, builtin));
    }
}
