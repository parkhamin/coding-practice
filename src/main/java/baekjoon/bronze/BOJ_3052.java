package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = (Integer.parseInt(br.readLine())) % 42;
        }

        int count = 1;
        for(int i = 1; i < 10; i++) {
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                count++;
            }
        }

        System.out.println(count);
    }
}
