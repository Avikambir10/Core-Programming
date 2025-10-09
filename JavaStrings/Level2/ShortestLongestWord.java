package JavaStrings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {
    static int getLength(String s) {
        int c = 0; try { while (true) s.charAt(c++); } catch (Exception e) {}
        return c;
    }

    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split(" ");
        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (getLength(w) < getLength(shortest)) shortest = w;
            if (getLength(w) > getLength(longest)) longest = w;
        }
        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}
