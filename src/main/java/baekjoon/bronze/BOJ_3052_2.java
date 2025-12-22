package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean[] flag = new boolean[42];
        int count = 0;

        for(int i = 0; i < 10; i++) {
            int index = (Integer.parseInt(br.readLine())) % 42;

            if(!flag[index]) {
                flag[index] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
