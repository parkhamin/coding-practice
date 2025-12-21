package baekjoon.bronze;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BOJ_2444 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
               bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
