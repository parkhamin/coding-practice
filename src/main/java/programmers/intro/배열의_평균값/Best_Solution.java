package programmers.intro.배열의_평균값;

public class Best_Solution {
  public double best_solution(int[] numbers) {
    int sum = 0;

    for(int i: numbers) sum += i;

    return (double) sum / numbers.length;
  }
}
