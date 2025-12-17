package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int[] bArray = new int[b.length()];
        for (int i = 0; i < b.length(); i++) {
            bArray[i] = Integer.parseInt(b.charAt(i) + "");
        }

        for (int i = 3; i > 0; i--) {
            System.out.println(bArray[i-1] * a);
        }

        System.out.println(a * Integer.parseInt(b));
    }
}
