package day7;

public class Lv_0_Number_of_Ordered_Pair {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<= n; i++){
            if(n == ((n / i) * i)) // n % i == 0
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
