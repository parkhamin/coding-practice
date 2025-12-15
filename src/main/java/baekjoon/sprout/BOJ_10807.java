package baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 첫째줄 읽어서 N에 대입

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine()); // 둘째줄 읽어서 배열에 대입
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine()); // 셋째줄 읽어서 v에 대입

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
