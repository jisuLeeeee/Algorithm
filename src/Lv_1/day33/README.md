# Day32

---

### <2032-04-20>

> **********풀이 문제**********
>
- 음양 더하기
    - true or false에 따라 배열의 부호를 저장하고 for문을 한번 더 사용해서 합계를 나타냈지만, 처음 부호를 저장하지 않고 + or -를 바로 계산해주면 for문을 한번 사용함(다른 사람풀이 참조) / if(arr[i] == true) ⇒ if(arr[i])처럼 boolean값을 직접 작성하지 않아도 배열 값 자체가 boolean값이니 후자로 표현하는 것이 더 깔끔함
- 없는 숫자 더하기
    - 중첩 반복문 사용하는 것은 너무 복잡하고 contains를 사용하려면 매개변수 배열과 0~9를 저장한 배열을 ArrayList 배열로 만들어서 0~9까지 숫자 중 주어진 배열의 원소가 포함되지 않은 수를 더해야 함 (다른사람 풀이 참조)

        ```java
        import java.util.*;
        
        class Solution { // 본인이 아래 코드처럼 구현하려다 실패...
            public int solution(int[] numbers) {
                int answer = -1;
        
                ArrayList<Integer> arr1 = new ArrayList<>();
                for(int i=0; i < 10; i++){
                    arr1.add(i);
                }
        
                ArrayList<Integer> arr2 = new ArrayList<>();
                for(int i=0; i < numbers.length; i++){
                    arr2.add(numbers[i]);
                }
        
                int sum = 0;
                for(int i=0; i < arr1.size(); i++){
                    if(!arr2.contains(arr1.get(i))){
                        sum += arr1.get(i);
                    }
                }
                return sum;
            }
        }
        ```

    - 0~9까지의 합 45에서 주어진 배열 원소의 합을 뺀 값을 리턴
- 가운데 글자 가져오기
- 수박수박수박수박수박수?
- 내적