package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int origin = Integer.parseInt(br.readLine());
        int N = origin;
        int count = 0;

        while(true){
            int n = N / 10;
            int m = N % 10;
            int temp = m * 10 + (n + m) % 10;
            count++;
            if (temp == origin) break;
            N = temp;
        }

        System.out.println(count);
    }
}
