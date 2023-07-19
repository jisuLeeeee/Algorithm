# Day71

---

### <2023-07-18>

> ********************풀이 문제********************
>
- 주식 가격
    - 아래의 코드로 풀이를 제출하면 입출력 예시는 통과지만 TC는 1번을 제외하고 실패이며 효율성은 시간초과
    - prices의 길이가 최대 10만이기 때문에 이중 for문으로 문제가 해결된다해도 시간복잡도 $O(n^2)$으로 다소 비효율적인 코드

    ```java
    class Solution {
        public int[] solution(int[] prices) {
            int[] answer = new int[prices.length];
            
            for(int i=0; i<prices.length; i++){
                for(int j=i+1; j<prices.length; j++){
                    if(prices[i] <= prices[j]){
                        answer[i]++;
                    }
                }
            }
            return answer;
        }
    }
    ```

    - 문제의 카테고리 스택/큐이기 때문에 Stack클래스를 이용해서 풀이
        - stack에 인덱스를 push하고 현재의 숫자가 stack에서 stack에서 peek한 숫자(인덱스)보다 작다면 현재 시점의 인덱스에서 stack에서 peek한 인덱스를 배서 answer 배열에 저장(***while문이 포인트***)