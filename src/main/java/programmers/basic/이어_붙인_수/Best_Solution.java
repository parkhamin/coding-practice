package programmers.basic.이어_붙인_수;

public class Best_Solution {
  public int best_Solution(int[] num_list) {
    int answer = 0;
    StringBuilder even = new StringBuilder();
    StringBuilder odd = new StringBuilder();

    for(int i : num_list){
      if (i % 2 == 0) even.append(i);
      else odd.append(i);
    }

    answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());

    return answer;
  }
}

/*
1. StringBuilder 쓰는 습관 들이기
2. StringBuilder는 String이 아닌 '도구'
-> Integer.parseInt()는 String만 받기 때문에 even.toString()으로 변환 후 사용
 */
