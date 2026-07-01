package programmers.basic.수_조작하기_1;

/*
정수 n과 문자열 control이 주어집니다.
control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.

"w" : n이 1 커집니다.
"s" : n이 1 작아집니다.
"d" : n이 10 커집니다.
"a" : n이 10 작아집니다.
위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
 */

public class Solution {
  public int solution(int n, String control) {
    int count = control.length();

    for (int i =0; i < count; i++){
      switch (control.charAt(i)){
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
1. 문제를 잘 읽고 함수가 answer를 리런하는지, n을 리턴하는지 확인
2. 구형 switch문을 쓸 때는 맨 마지막 case를 포함해 모든 case 끝에 'break;'를 빠짐없이 붙였는지 확인!
3. 신형 자바 14 이후로는 -> 로 우측에 있는 딱 한 줄(또는 중괄호 블록)만 실행하고 자동으로 switch문을 탈출
 */