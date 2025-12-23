package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < R; k++) sb.append(s.charAt(j));
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
