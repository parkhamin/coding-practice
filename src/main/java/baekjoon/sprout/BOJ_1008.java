package baekjoon.sprout;

import java.util.Scanner;

public class BOJ_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  int / int = int
           int / float = float
           float / int = float
           float / float = float
         */
        // 백준에서는 더 정밀하게 수를 나타낼 수 있는 double 쓰는 것 추천
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((double)a / b);

        /*
        double a = sc.nextDouble();
        int b = sc.nextInt();
        System.out.println(a / b);
         */
    }
}
