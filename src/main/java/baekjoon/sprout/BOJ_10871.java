package baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;

        str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);

        str = br.readLine().split(" ");
        for (int i = 0; i < N; i++){
            if (X > Integer.parseInt(str[i])){
                System.out.print(str[i] + " ");
            }
        }
    }
}
