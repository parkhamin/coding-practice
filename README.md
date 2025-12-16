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