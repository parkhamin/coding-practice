package baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while(str != null) {
            if (str.trim().isEmpty()) continue; // 빈 줄이라면 프로그램 계속 진행하기
            String[] arr = str.split(" ");
            int a = Integer.parseInt(arr[0]); // 1
            int b = Integer.parseInt(arr[1]); // 1
            System.out.println(a+b); // 2

            str = br.readLine();
        }

        br.close();
    }
}
