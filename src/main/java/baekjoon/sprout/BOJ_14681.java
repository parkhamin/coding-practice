package baekjoon.sprout;

import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        //sc.nextLine(); // 엔터 후에 새로운 정수를 받기 위함.
        int y = sc.nextInt();

        if (x >= -1000 && x <= 1000 && y >= -1000 && y <= 1000){
            if (x > 0 ){
                if (y > 0) System.out.println("1");
                else System.out.println("4");
            }else {
                if (y > 0) System.out.println("2");
                else System.out.println("3");
            }
        }
    }
}
