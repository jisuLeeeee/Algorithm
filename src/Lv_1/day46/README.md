# Day46

---

### <2023-05-19>

> **풀이문제**
>
- 소수찾기
    - n ≥ 2 이기 때문에 2는 무조건 포함한다는 의미에서 answer = 1로 초기화하고 홀수들만 검사

    ```java
    class Solution {
        public int solution(int n) {
            int answer = 1;
            int cnt = 0;
            
            for(int i=3; i<=n; i+=2){
                for(int j=1; j<=i; j++){
                    if(i % j == 0){
                        cnt++;
                    }
                }
                if(cnt == 2)
                    answer++;
                cnt = 0;
            }
            
            return answer;
        }
    }
    ```

    - 위의 코드로 했을 때 테스트케이스 10, 11, 12, 효율성 테스트모두가 시간초과로 실패
    - 찾아보니 “에라토스테네스의 체”의 방식을 이용하면 효율성과 실패한 테케들을 해결할 수 있다고 함
        - 에라토스테네스의 체 ⇒ 소수를 찾는 방법 중 하나로 주어진 수의 제곱근 보다 작은 수의 배수들을 지우고 남은 수가 소수인 방식

    ```java
    class Solution {
        public int solution(int n) {
            int answer = 0;
            
            int[] number = new int[n+1];
            
            for(int i=0; i<=n; i++){
                number[i] = i;
            }
            
            for(int i=2; i<=n; i++) {
                if(number[i] != 0) {
                    for(int j=i+i; j<=n; j+=i) {
                        number[j] = 0;
                    }
                }
            }
            
            for(int i=2; i<=n; i++) {
                if(number[i] != 0) answer++;
            }
            return answer;
        }
    }
    ```

    1. 검사할 n까지의 수를 저장할 배열을 만듬
    2. 0, 1은 소수가 아니기 때문에 제외하고 2를 제외한 2의 배수부터 0으로 만듬
    3. 다음 3의 배수들을 0으로 만듬
    4. 4는 2의 배수에서 0이 되었기 때문에 4의 배수는 검사하지 않아도됨
    5. 5, 7의 배수들을 차례대로 검사해서 0으로 만들고 number[]에서 남은 소수들의 개수를 반환
- 소수만들기
    - 배열에서 3개의 숫자들을 더해야해서 3중 for문을 작성했고 소수 판별 메소드를 만들어서 문제 풀이함
- 과일 장수
    - 주어진 배열을 정렬 후 한 상자의 담을 수 있는 사과 m개 -하는 인덱스 설정을 해서 풀이함
- 모의고사
    - 수포자가 찍는 방식의 규칙을 배열로 만들고 correct[]에서 최댓값을 Math.max()로 찾아서 가변 길이 배열에 최댓값이 있는 인덱스+1을 추가해서 반환함