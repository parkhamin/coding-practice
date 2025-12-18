package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < N; i++) {
            if (max <= array[i]) {
                max = array[i];
            }
            if (min >= array[i]) {
                min = array[i];
            }
        }

        System.out.println(min + " " + max);


    }
}
