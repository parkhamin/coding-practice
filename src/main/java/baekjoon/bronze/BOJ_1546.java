package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 과목의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[N];

        double M = 0;
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            if (score[i] > M) M = score[i];
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += score[i] / M * 100;
        }

        System.out.println(sum / N);
    }
}
