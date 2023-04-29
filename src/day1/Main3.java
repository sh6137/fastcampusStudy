package day1;

import java.util.Scanner;

public class Main3 {
    //    1157
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] count = new int[26];
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count[str.charAt(i) - 'a']++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count[str.charAt(i) - 'A']++;
            }
        }
        int max = count[0];
        int num = 0;
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                num = i;
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (max == count[i]) {
                maxCount++;
            }
        }
        if (maxCount > 1) {
            System.out.println("?");
        } else {
            char a = (char) ('A' + num);
            System.out.println(String.valueOf(a).toUpperCase());
        }
    }
}
