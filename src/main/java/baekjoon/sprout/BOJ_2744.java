package baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i=0 ; i < str.length(); i++){
            if((int)str.charAt(i) >= 97){
                System.out.print((char)(str.charAt(i) - 32));
            }else {
                System.out.print((char)(str.charAt(i) + 32));
            }
        }
    }

}
