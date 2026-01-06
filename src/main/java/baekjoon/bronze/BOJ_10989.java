package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10989 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] nums = new int[10001];
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      nums[Integer.parseInt(br.readLine())]++;
    }

    for (int i = 1; i < 10001; i++) {
      while (nums[i] > 0) {
        bw.write(i + "\n");
        nums[i]--;
      }
    }

    bw.flush();
  }
}
