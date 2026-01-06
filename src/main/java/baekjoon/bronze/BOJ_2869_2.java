package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken()); // 낮에 A미터 올라감
    int B = Integer.parseInt(st.nextToken()); // 밤에 B미터 미끄러짐
    int V = Integer.parseInt(st.nextToken()); // 나무의 높이

    // 마지막날에는 미끄러짐 없이 항상 A를 올라가므로
    // 그 전까지 올라가야 하는 높이는 V - B
    // 하루에 올라갈 수 있는 높이는 A - B
    // 즉, 달팽이는 (V - B)를 (A - B)로 채운다.
    // 채운다는 것은 조금이라도 남으면 올림을 해줘야한다. -> 올림 나눗셈
    // 올림 나눗셈 공식 (x+y-1) / y
    // 대입: (V - B + A - B - 1 ) / (A - B)

    int answer = 0;
    if (A >= V) answer = 1;
    else answer = ((V - A) + (A - B) -1) / (A - B) + 1;

    System.out.println(answer);
  }
}
