package day1;

import java.util.Scanner;

public class Main2 {
    //    1919
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine(); //abc
        String str2 = in.nextLine(); //b
        int result = 0;

        int[] intA = new int[26];
        int[] intB = new int[26];

        // intA 배열 [] 번째에 값음 증가시킨다.
        for (int i = 0; i < str1.length(); i++) {
            intA[str1.charAt(i) - 'a']++;
        }
        // intB 배열 [] 번째에 값음 증가시킨다.
        for (int i = 0; i < str2.length(); i++) {
            intB[str2.charAt(i) - 'a']++;
        }
        // intA = [1][1][1]
        // intB = [0][1][0]

        // intA[] 값과 intB[] 값을 뺀다.
        // 그리고 result 에 값을 더한다.
        for (int i = 0; i < intA.length; i++) {
            result += Math.abs(intA[i] - intB[i]);
        }
        System.out.println(result);
    }
}
