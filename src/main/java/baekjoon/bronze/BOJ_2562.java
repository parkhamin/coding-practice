package baekjoon.bronze;

import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int index = 1;
        for (int i = 1; i < 9; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
