package day3;

import java.util.Scanner;

public class Main {
    //    10158
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String space = in.nextLine();
        String target = in.nextLine();
        int time = Integer.parseInt(in.nextLine());
        String[] spaceArray = space.split(" ");
        int[] spaceNum = new int[]{Integer.parseInt(spaceArray[0]), Integer.parseInt(spaceArray[1])};
        String[] targetArray = target.split(" ");
        int[] targetNum = new int[]{Integer.parseInt(targetArray[0]), Integer.parseInt(targetArray[1])};
        int moveX = 1;
        int moveY = 1;
        for (int i = 0; i < time; i++) {
            if (spaceNum[0] == targetNum[0]) {
                moveX = -1;
            }
            if (spaceNum[1] == targetNum[1]) {
                moveY = -1;
            }
            if (targetNum[0] == 0) {

            }

            targetNum[0] = targetNum[0] + moveX;
            targetNum[1] = targetNum[1] + moveY;
        }
        System.out.println(targetNum[0] + " " + targetNum[1]);
    }
}
