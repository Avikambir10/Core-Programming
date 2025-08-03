package JavaStrings.Level2;

import java.util.Scanner;

public class WordsLength2D {
    static int getLength(String s) {
        int c = 0;
        try {
            while (true)
                s.charAt(c++);
        } catch (Exception e) {
        }
        return c;
    }

    static String[][] wordsWithLength(String s) {
        String[] words = s.split(" ");
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        String[][] data = wordsWithLength(new Scanner(System.in).nextLine());
        System.out.println("Word\tLength");
        for (String[] row : data)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}
