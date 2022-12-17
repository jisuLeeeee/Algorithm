package day3;

public class Lv_0_Lamb_Skewers {
    public int solution(int n, int k) {
        int answer = 0;

        if(n >= 10){
            int num = n / 10;

            answer = (12000 * n) + (2000 * k) - (num * 2000);
        }
        else {
            answer = (12000 * n) + (2000 * k);
        }

        return answer;
    }
}
