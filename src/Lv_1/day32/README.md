# Day32

---

### <2032-04-19>

> **********풀이 문제**********
>
- 두 정수 사이의 합
    - 사용이 겹치는 코드를 calc() 메소드로 묶어서 사용
- 콜라츠 추측
    - solution 메소드의 인자값을 int ⇒ long으로 변경
- 서울에서 김서방 찾기
- 나누어 떨어지는 숫자 배열
    - for문을 2번쓰고 Arrays를 import해서 sort()로 정렬하는 방법(1)과 ArrayList 배열로 만들어서 add를 사용하여 Collections.sort() 정렬 후 list.stream().mapToInt(Integer::intValue).toArray()로 배열 전환하는 방법(2)을 구현, 속도는 방법(1)이 더 빠름
- 핸드폰 번호 가리기
    - substring()을 사용