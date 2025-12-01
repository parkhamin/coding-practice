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