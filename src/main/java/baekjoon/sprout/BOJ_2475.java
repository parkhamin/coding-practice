package baekjoon.sprout;

import java.util.Scanner;

public class BOJ_2475 {
    public static int function(int[] array){
        int result = 0;
        for (int j : array) {
            result += j * j;
        }
        return result % 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(function(array));
    }
}
