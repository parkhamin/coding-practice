package programmers.basic.오명씩;

/*
최대 5명씩 탑승가능한 놀이기구를 타기 위해 줄을 서있는 사람들의 이름이 담긴 문자열 리스트 names가 주어질 때,
앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return하도록 solution 함수를 완성해주세요.
마지막 그룹이 5명이 되지 않더라도 가장 앞에 있는 사람의 이름을 포함합니다.
 */

public class Solution {
  public String[] solution(String[] names) {
    // 총 줄을 서는 사람들의 수
    int count = names.length;

    // 5명씩 그룹화 수
    // 사람들을 5명씩 나누었을 때 나머지가 없다면 그대로 그룹화 가능
    // 하지만 나머지가 있으면 5명이 그룹으로 되지 않아도 나머지로 그룹을 하나 더 만들어야 함
    int group = count % 5 == 0 ? count / 5 : count / 5 + 1;

    String[] answer = new String[group];

    for(int i = 0; i < group; i++){
      answer[i] = names [i * 5];
    }

    return answer;
  }
}

/*
1. 접근은 좋았지만 예외 상황에 대한 고려 없이, 무조건 방이 하나 더 필요할 것이라고 단정 지은 것
 */
