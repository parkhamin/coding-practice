package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978_2 {
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
            boolean isPrime = true;

            if (array[i] < 2) continue;

            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) decimalCount++;
        }

        System.out.println(decimalCount);
    }
}
