# Day60

---

### <2023-06-16>

> ********************풀이 문제********************
>
- 신고 결과 받기
    - Map을 이용해서 신고당한사람(Key), 신고한 사람들(Value)으로 나누고, 신고한 사람들의 수가 정지 기준의 수를 넘는다면 신고한 사람들 이름을 탐색해서 +1 누적
        - Map<String, HashSet<String>> reportMap = new HashMap<>();

          reportMap.put(name, new HashSet<>());

          reportMap.get(string).add(string);

        - 위의 3줄처럼 구현 시 Value의 값이 중복으로 저장됨을 이번 문제를 통해 발견함
- 할인 행사
    - HashMap을 사용해서 상품의 이름과 수량을 저장
    - discount 배열을 검사해서 dHashMap에 10일간의 할인행사 물품을 저장하고 map의 수량과 dHashMap의 수량이 같다면 answer += 1(다른사람 풀이 참조)