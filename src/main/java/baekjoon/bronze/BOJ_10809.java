package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] array = new int[26];

        for (int i = 0; i < 26; i++){
            array[i] = -1;
        }

        for (int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 'a'; // b
            if (array[index] != -1){
                continue;
            }
            array[index] = i;
        }

        for (int i : array) System.out.print(i + " ");
    }
}
