# Day79

---

### <2023-09-05>

> **********************풀이 문제**********************
>
- 명예의 전당
    - 명예의 전당의 등록 가능한 k개를 먼저 배열에 저장하고 k개 이상의 점수들을 2번째 for문에서 검사해서 최하위 점수를 return 배열에 저장
    - 아래의 코드는 맨 처음 점수를 저장할 때 최하위 점수를 가리기 위해 조건문을 만드는 코드인데, IntelliJ에서 수정해준 코드로 보니 min 함수를 사용해서 훨씬 간결하고 가독성이 있어서 참고하려고 기록

    ```java
    for(int i=1; i<k; i++){
                if(i == score.length){ // k의 수가 score의 길이보다 클 때 조건문
                    return answer;
                }
                if(answer[i-1] < score[i]){
                    answer[i] = answer[i-1];
                    k_arr[i] = score[i];
                }
                else{
                    answer[i] = score[i];
                    k_arr[i] = score[i];
                }
    
            }
    
    🔄
    ⬇️
    
    for(int i=1; i<k; i++){
                if(i == score.length){ // k의 수가 score의 길이보다 클 때 조건문
                    return answer;
                }
                answer[i] = Math.min(answer[i - 1], score[i]);
                k_arr[i] = score[i];
            }
    ```

    - **PriorityQueue 클래스**를 사용하면 쉽게 풀이 가능한 문제였지만 배열에만 전전긍긍하며 풀이해서 아쉬움