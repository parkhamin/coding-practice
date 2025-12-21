package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층
            int W = Integer.parseInt(st.nextToken()); // 방의 갯수
            int N = Integer.parseInt(st.nextToken()); // 내가 배정하고자 하는 손님

            int newH = 0;
            int newW = 0;
            if (N % H == 0){
                newW = N / H;
                newH = H;
            }
            else{
                newW = (N / H) + 1;
                newH = N % H;
            }

            bw.write(newH + String.format("%02d", newW) + "\n");
        }
        bw.flush();
    }
}
