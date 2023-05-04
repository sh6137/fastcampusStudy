package day3;

import java.util.Scanner;

public class Main {
    //    10158
    //todo : 10158 개미 복습하기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); //격자의 가로길이
        int H = in.nextInt(); //격자의 세로길이
        int P = in.nextInt(); //개미좌표 x
        int Q = in.nextInt(); //개미좌표 y
        int T = in.nextInt(); //시간

        int p = (P + T) % (2 * W);
        int q = (Q + T) % (2 * H);

        if (p > W) {
            p = 2 * W - p;
        }
        if (q > H) {
            q = 2 * H - q;
        }
        System.out.println(p + " " + q);
    }
}
