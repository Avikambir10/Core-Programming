package JavaStrings.Level2;

import java.util.Scanner;

public class VowelConsonantCount {
    static boolean isVowel(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++; else c++;
            }
        }
        System.out.println("Vowels: " + v + " Consonants: " + c);
    }
}
