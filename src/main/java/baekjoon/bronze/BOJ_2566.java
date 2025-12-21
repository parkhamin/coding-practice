package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2566 {
    public static void main(String[] args) throws IOException {
        int[][] array = new int[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 9; i++) {
            st= new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
