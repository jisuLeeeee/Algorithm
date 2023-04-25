package Lv_1.day34;

import java.util.Arrays;

public class GCD_LCM {
    public int[] solution(int n, int m) {
        int[] answer = {1,1};
        int numMax  = Math.max(n, m), numMin = Math.min(n, m);


        // 최대공약수 구하기(유클리드 호제법)
        int diff = numMax - numMin;
        for(int i=1; i<=diff; i++){
            if(diff % i == 0){
                if(numMax % i == 0 && numMin % i == 0)
                    answer[0] = i;
            }
        }

        // 최소공배수 구하기
        int a = 0, b = 0;

        for(int i=2; i<=Math.max(n,m); i++){
            if(numMax % i == 0 && numMin % i == 0){
                answer[1] *= i;
                numMax /= i; numMin /= i;
                a = numMax; b = numMin;
                i--;
            }
        }
        answer[1] *= (a*b);

        if(answer[1] == 0)
            answer[1] = n*m;

        return answer;
    }

    public static void main(String[] args) {
        GCD_LCM gcdLcm = new GCD_LCM();
        int a = 3, b = 12;
        System.out.println(Arrays.toString(gcdLcm.solution(a, b)));
    }
}
