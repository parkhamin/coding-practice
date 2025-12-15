package baekjoon.sprout;

import java.util.Scanner;

public class BOJ_5597 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[28];

        for (int i = 0; i < 28; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 30; i++){
             boolean isSubmit = false;
            for (int j = 0; j < 28 ; j++){
                if (i == arr[j]){
                    isSubmit = true;
                    break;
                }
            }
            if (!isSubmit){
                System.out.println(i);
            }
        }
    }
}
