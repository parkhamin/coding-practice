package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int need = Integer.parseInt(br.readLine());

        int total = minute + need;
        minute = total % 60;
        hour = hour + (total / 60);

        if (hour > 23) hour %= 24;

        System.out.println(hour + " " + minute);
    }
}
