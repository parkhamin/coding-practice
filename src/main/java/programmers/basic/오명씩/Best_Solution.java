package programmers.basic.오명씩;

public class Best_Solution {
  public String[] best_solution(String[] names) {
    int group = (names.length + 4) / 5;
    String[] answer = new String[group];

    int index = 0;
    for (int i = 0; i < names.length; i += 5) {
      answer[index++] = names[i];
    }

    return answer;
  }
}

/*
[정수 나눗셈 올림(Celling) 정리]
1. 자바에서 int끼리 나누면 소수점이 버려짐 (예: 6 / 5 = 1)
2. 조건문(if, 삼항연산자) 없이 올림 처리를 하려면 분자에 +(나누는수 - 1)을 해준다.
3. 범용 공식: (전체 개수 + (N - 1)) / N

- 5명씩 묶기: (count + 4) / 5
- 10개씩 페이징: (total + 9) / 10
 */
