package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int decimalCount = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) count++;
            }
            if (count == 2) decimalCount++;
        }
        System.out.println(decimalCount);
    }
}
