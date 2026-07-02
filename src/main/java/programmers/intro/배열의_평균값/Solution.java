package programmers.intro.배열의_평균값;

/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */

public class Solution {
  public double solution(int[] numbers) {
    int sum = 0;

    for(int i = 0; i < numbers.length; i++){
      sum += numbers[i];
    }

    double count = numbers.length;
    return sum / count;
  }
}

/*
1. sum과 count 중 나누는 대상 중 하나만 double이면 소수점이 살아남는다.
2. sum과 int로 두고 (double) sum / count로 리턴할 때 명시적으로 형변환 가능
 */
