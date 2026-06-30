package programmers.basic.이어_붙인_수;

/*
정수가 담긴 리스트 num_list가 주어집니다.
num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */

public class Solution {
  public int solution(int[] num_list) {
    int answer = 0;
    String odd = "";
    String even = "";

    for(int i : num_list){
      if(i % 2 == 0){
        even += String.valueOf(i);
      } else odd += String.valueOf(i);
    }

    answer = Integer.parseInt(even) + Integer.parseInt(odd);
    return answer;
  }
}

/*
1. int -> String : String.valueOf
2. String -> int : Integer.valueOf, Integer.parseInt
 */
