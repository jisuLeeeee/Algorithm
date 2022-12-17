package day3;

public class Lv_0_Division_Numbers {
    public int solution(int num1, int num2) {
        int answer = 0;

        if(num1 > 0 && num1 <= 100){
            if(num2 > 0 && num2 <= 100){
                double double_ans = (double)num1 / num2;

                double_ans *= 1000;

                answer = (int)double_ans;
            }
        }
        return answer;
    }
}
