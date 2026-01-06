package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken()); // 낮에 A미터 올라감
    int B = Integer.parseInt(st.nextToken()); // 밤에 B미터 미끄러짐
    int v = Integer.parseInt(st.nextToken()); // 나무의 높이

    int snail = 0;
    int count = 0;

    while (true) {
      snail += A;

      if (snail >= v){
        count++;
        break;
      }

      snail -= B;
      count++;
      if (snail < 0) snail = 0;
    }

    System.out.println(count);
  }
}
