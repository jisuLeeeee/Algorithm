package day30;

public class Lv_1_Sum_Of_Divisor {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(n % i == 0)
                answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_1_Sum_Of_Divisor sumOfDivisor = new Lv_1_Sum_Of_Divisor();
        int a = 12;
        System.out.println(sumOfDivisor.solution(a));
    }
}
