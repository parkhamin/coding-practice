package programmers.basic.수_조작하기_1;

public class Best_Solution {
  public int best_Solution(int n, String control) {

    for (char ch : control.toCharArray()){
      switch (ch){
        case 'w' -> n += 1;
        case 's' -> n -= 1;
        case 'd' -> n += 10;
        case 'a' -> n -= 10;
      }
    }

    return n;
  }
}

/*
1. toCharArray로 문자열 배열로 펼쳐놓고 반복문 돌리는 것이 속도 훨씬 빠름
 */
