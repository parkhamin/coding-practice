package programmers.basic.배열_만들기_1;

/*
정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */

public class Solution {
  public int[] solution(int n, int k) {
    int count = n/k;
    int[] answer = new int[count];

    for(int i = 0; i < count; i++){
      answer[i] = k * (i + 1);
    }
    return answer;
  }
}

/*
1. 배열 크기 할당 안 함
2. 먼저 배열 크기를 할당 후 사용하면 배열 원소의 기본값은 0이기 때문에 모두 0으로 채워짐
-> [0, 0, 3, 0, 0, 6, 0, 0, 9, 0] 같은 문제 발생
3. 따라서 먼저 배열의 크기를 구한 후, k의 배수만  배열에 할당
 */
