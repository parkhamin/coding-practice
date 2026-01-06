package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int C = Integer.parseInt(br.readLine());

    for (int i = 0; i < C; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int N = Integer.parseInt(st.nextToken());
      int[] score = new int[N];
      int sum = 0;
      double avr = 0;

      for (int j = 0; j < N; j++) {
        score[j] = Integer.parseInt(st.nextToken());
        sum += score[j];
      }

      avr = (double) sum / N;

      int count = 0;
      for (int k = 0; k < N; k++) {
        if (score[k] > avr) count++;
      }

      double rate = (double) count / N;
      System.out.println(String.format("%.3f", rate * 100) + "%");
      //System.out.printf("%.3f%n", rate);
    }
  }
}
