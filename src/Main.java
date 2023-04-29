import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            //만약에 소문자 범위 라면
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                //대문자 A 에 (입력값 - 소문자 a) 만큼의 거리를 더한다.
                //(입력값 - 소문자 a) 가 거리
                chars[i] = (char) ('A' + chars[i] - 'a');
            } else {
                //소문자 a 에 (입력값 - 대문자 A) 만큼의 거리를 더한다.
                chars[i] = (char) ('a' + chars[i] - 'A');
            }
        }
        System.out.println(chars);
    }
}