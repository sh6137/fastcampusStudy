package day2;

import java.util.Scanner;

public class Main {
    //    1543
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String doc = in.nextLine();
        String word = in.nextLine();
        int count = 0;
        int startIndex = 0;
        while (true) {
            int findIndex = doc.indexOf(word, startIndex);
            if (findIndex < 0) {
                break;
            } else {
                count++;
                startIndex = findIndex + word.length();
            }
        }
        System.out.println(count);
    }
}
