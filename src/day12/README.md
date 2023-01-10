# Day12

---

## 문제풀이 열두번째날 <2023-1-10>

> **풀이 문제**
>
- 인덱스 바꾸기
    - 인덱스 num1값을 저장하기 위해 charAt()으로 반환한 문자를 String.valueOf() 사용해서 String으로 형 변환시켰지만 그렇게 할 필요가 없었다. 문자열을 split() 메소드로 배열에 저장하고 배열에서 num1인덱스를 찾아서 저장하는게 더 깔끔하다.
        - String.valueOf() ⇒ 파라미터가 null이면 문자열 "null"을 만들어서 반환
        - Integer.toString() ⇒ "Null PointerException"이라는 오류를 발생
- 숫자찾기
    - int len = (int)( Math.log10(num)+1 ); ⇒ 정수형 길이 구하는 실행문을 사용해서 for문으로 숫자의 자릿수만큼 반복 실행한다. 반환할 변수는 -1로 초기화시키고 끝자리 부터 주어진 정수와 맞는지 비교한다. 같아도 앞자릿수에 동일한 수가 있을수 있으므로 break문은 쓰지 않고 10으로 나눠서 검사를 계속한다.
    - 다른사람의 풀이를 참조했을 때 반복문을 사용하지 않고 문자열로 변환하여 indexOf()로 알맞은지 검사후 인덱스를 반환한다.

    ```java
    public int solution(int num, int k) {
            int answer = 0;
            String num_str = Integer.toString(num);
            String k_str = Integer.toString(k);
            
            if(num_str.indexOf(k_str) == -1)
                answer = -1;
            else
                answer = num_str.indexOf(k_str) + 1;
            
            return answer;
        }
    ```

    - indexOf() ⇒ 문자열에서 특정 단어가 있는지를 찾고, 있을 경우 인덱스를 리턴 없을 경우 -1을 리턴하는 내장함수
- 369게임
    - 앞 문제와 동일하게 나머지 연산을 사용해서 정수의 끝자리부터 3, 6, 9 숫자가 있는지 확인했다.
        - if문에서 정수 /= 10; 실행문을 쓰지 않아서 처음에 오류가 발생했다.
    - for문에서는 얼만큼 반복할 지 조건식을 쓰기위해 int의 길이를 알아야하지만 while(주어진 수 > 0)을 사용하면 굳이 길이를 구하는 변수를 만들지 않아도 된다.(다른사람 풀이 참조)

[Java로 배우는 자료구조 강의](https://www.notion.so/Java-105d9fbac07844618cf8c68054bedd69)

[자바 입문 강의](https://www.notion.so/de30dae8ab1842b0961e8a3b8a0c40c9)

> 오늘의 소감
>

인덱스 바꾸기 문제에서 int형을 String형으로 변환을 할 때 toString()과 valueOf()의 차이점에 대해 궁금증이 생겼다. 둘 다 int형에서 String형으로 바꾸는 것은 같지만 값이 null일 때 차이가 있었다. 이러한 메소드처럼 목적은 같지만 실행하는 과정 속 다른점이 있는 메소드들을 잘 구별해서 사용해야겠다. 자료구조 강의코드에서 메소드를 호출하는 부분이 실행되지 않아서 원하는 결과값이 나오지 않았다. 이유는 IntelliJ에 디렉토리 설정을 잘못해서 run이 제대로 되지않았다. 파일의 데이터를 읽어서 정렬하는 함수였는데 텍스트 파일의 확장자 때문인줄알고 괜히 지웠다 쓰고 새 파일도 만들었었다. “왜 안되지?”를 수 백번 생각했고 결과적으로는 해결됐으니 속이 뻥 뚫렸다. 뭐든 인내하면 다져진다.!