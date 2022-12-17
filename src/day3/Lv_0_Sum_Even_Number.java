package day3;

public class Lv_0_Sum_Even_Number {
    public int solution(int n) {
        int answer = 0;

        if(n > 0 && n <= 1000){
            for(int i =0; i <= n; i+=2){
                answer += i;
            }
        }

        return answer;
    }
}
