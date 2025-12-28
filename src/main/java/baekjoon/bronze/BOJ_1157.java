package baekjoon.bronze;

import java.io.*;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] dictionary = new int[26];

        for (int i = 0; i < word.length(); i++) {
            dictionary[word.charAt(i) - 'A']++;
        }

        int max = 0;
        int count = 0;
        int index = 0;
        for (int i = 0; i < 26; i++) {
            if (dictionary[i] > max){
                max = dictionary[i];
                count = 1;
                index = i;
            } else if (dictionary[i] == max){
                count++;
            }
        }

        if (count == 1) {
            System.out.println((char)('A' + index));
        } else System.out.println("?");
    }
}
