package day1;

import java.util.Scanner;

public class Main2 {
    //    1919
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int result = 0;

        int[] charA = new int[26];
        int[] charB = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            charA[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            charB[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < charA.length; i++) {
            result += Math.abs(charA[i] - charB[i]);
        }
        System.out.println(result);
    }
}
