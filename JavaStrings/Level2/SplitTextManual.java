package JavaStrings.Level2;

import java.util.Scanner;

public class SplitTextManual {
    static String[] manualSplit(String s) {
        int count = 1;
        for (char c : s.toCharArray()) if (c == ' ') count++;
        String[] words = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        String[] manual = manualSplit(s), builtin = s.split(" ");
        System.out.println("Arrays Equal: " + compareArrays(manual, builtin));
    }
}
