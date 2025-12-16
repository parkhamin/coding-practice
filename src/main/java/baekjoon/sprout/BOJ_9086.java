package baekjoon.sprout;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_9086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String str = sc.next();
            if (str.length() == 1) sb.append(str + str + "\n");
            else {
                sb.append(str.charAt(0));
                sb.append(str.charAt(str.length() -1) + "\n");
            }
        }
        System.out.println(sb);
    }
}
