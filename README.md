# 코딩 테스트를 위한 레포지토리
***251128***
- LocalDate.now()
***
***251129***
- 사칙연산 시 int, long, double 확인하기
- int는 +-20억까지!
- sc.nextLine() : 두 개의 정수를 입력받을 때, 정수 사이 엔터가 필요할 때 사용
***
***251130***
- (정정) sc.nextLine() : nextInt()에서 nextLine 순서로 갈 때 중요
***
**251201**
1. 10951
   - String[] arr = br.readLine().split(" ") 을 받아서 null 조건을 확인하면 split 메소드에서 NullPointerException이 발생
   - 먼저 String으로 br.readLine() 한 줄을 받고
   - 이 str이 null인지 아닌지 조건으로 반복문을 돌기
2. 10951_version2
   - BufferedReader 말고 Scanner를 사용할 시
   - sc.hasNext() 로 조건 확인
***
**251215**
1. 15552
   - BufferedReader, BufferedWriter 사용
2. 10807
   - split 메서드 지양
   - StringTokenizer 사용 지향할 것
3. 5597
   - 중첩 반복문에서의 break과 continue
      - break : 안쪽 반복문만 종료
      - continue : 안쪽 반복문만 건너뜀
   - 조건식 초기화 위치 염두하기
4. 11654
   - 아스키코드 : char -> int 형변환
***
**251216**
1. 2744
   - Character.toUpperCase(char), Character.toLowerCase(char) 사용가능
2. 9086
   - char + char = int
   - char + char + "" 하면 문자열 덧셈 가능
3. 15964
   - 연산값이 int 범위를 넘을 것도 고려해서 자료값 타입 정하기
   - A, B는 100,000이라고 했지만 A와 B 가지고 연산한 값이 오버플로우 발생 가능
   - 따라서 long으로 강제캐스팅하거나 A와 B의 타입을 long으로 두어야 100점이 나온다.
***
**251217**
***
**251218**
1. 10818
   - 반복문 범위 끝까지 확인하기
2. 2562
   - 초깃값 설정 시 주의하기
3. 2525
```
   minute = (minute + need) % 60;
   hour = hour + ((minute + need) / 60);
```
   - 이렇게 코드 작성했었는데 minute의 값이 연산으로 달라졌는데 그 값으로 hour 값을 계산하니 종잡을 수 없는 값 탄생!
   - 변수의 값을 아래줄 연산에도 필요한 경우면 변수의 값이 바뀌지 않도록 신경써주자.
```
   int total = minute + need;
   minute = total % 60;
   hour = hour + (total / 60);
```
***
**251221**
1. 10250
```
   String.format("%02d", newW)
```
   - newW는 항상 2자리일 것이고, newW가 0부터 9의 수라면 앞자리를 0으로 채우겠다!
2. 2444
   - 다시 해보기
***
**251222**
1. 2675
   - BufferedWriter를 이용해서 맞긴 했지만
   - StringBuilder + BufferedWriter 조합 추천!
2. 10809
   - 문제를 맞추고 최적화 중에 배열을 전부 -1로 초기화하는 과정 중에 for-each문을 사용했는데 틀림
   - 찾아보니 for-each문은 배열의 값 복사본을 사용해서 배열의 실제 값이 바뀌는 것은 아니라고 한다.
   - 따라서 for-each문은 인덱스가 필요없고 출력/조회인 경우 사용해야 한다!
3. 3052
   - boolean 값 초기화 위치는 비교하려는 반복문 위여야 함!
   - 하나하나 비교하지 않아도 boolean 배열 선언하면 간단히 구현 가능
***
**251223**
1. 1978
```
   int decimalCount = 0;
   int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) count++;
            }
            if (count == 2) decimalCount++;
        }
```
   - 이중 반복문에서 안쪽 반복문 끝내고 다음 j로 검사할 때 count는 0으로 초기화 되지 않았기 때문에 count가 2가 될 수가 없는 구조였다.
   - 내가 조건을 확인할 때 필요한 변수가 초기화가 필요한 경우는 반복문 바로 위에 선언한다는 것을 염두하자.
```
   int decimalCount = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 1; j <= array[i]; j++) {
                if (array[i] % j == 0) count++;
            }
            if (count == 2) decimalCount++;
        }
```
   - 이 경우 정상 동작하는 것을 볼 수 있다.
