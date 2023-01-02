package day7;

import java.util.Arrays;

public class Lv_0_Hate_Even_Numbers {
    public int[] solution(int n) {
        int[] answer;
        int idx = 0;

        if(n % 2 ==0)
            answer = new int[n / 2];
        else
            answer = new int[n / 2 + 1];

        for(int i=1; i<=n; i+=2){
            answer[idx] = i;
            idx++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Hate_Even_Numbers hateEvenNumbers = new Lv_0_Hate_Even_Numbers();
        int a = 15;
        System.out.println(Arrays.toString(hateEvenNumbers.solution(a))); // 문자열 형태로 [ ] 안에 출력
    }
}
