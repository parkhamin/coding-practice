package programmers.basic.n개_간격의_원소들;

/*
정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 */

public class Solution {
  public int[] solution(int[] num_list, int n) {
    int count = (num_list.length + (n-1)) / n;
    int[] answer = new int[count];

    for(int i =0; i < count; i++){
      answer[i] = num_list[i * n];
    }
    return answer;
  }
}

/*
1. count 올림 공식을 적용하는 것을 gemini가 먼저 알려줘서 알고 시작함;
2. n개 간격으로 띄울 때 i + n을 했음 -> i * n이 정답
 */
