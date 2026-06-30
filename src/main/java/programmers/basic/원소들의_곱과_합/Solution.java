package programmers.basic.원소들의_곱과_합;

/*
정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 */

public class Solution {
  public int solution(int[] num_list) {
    int answer, sum = 0;
    int multi = 1;

    for (int j : num_list) {
      multi *= j;
      sum += j;
    }

    answer = multi < sum * sum ? 1 : 0;
    return answer;
  }
}

/*
1. 배열의 크기 구할 때 num_list.size()를 사용하고, length를 까먹음
2. 배열의 크기 구하지 않고, 향상된 for 반목문 사용 가능
3. 그리고 multi 값을 0으로 초기화하여 어떤 값을 곱해도 0이 나옴
-> 곱셈의 항등원은 1이라는 것 유의!!!!!!
 */