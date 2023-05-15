package Lv_2.day42;

public class Expression_of_Numbers {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum += j;
                if(sum == n)
                    answer++;
                else if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Expression_of_Numbers expressionOfNumbers = new Expression_of_Numbers();
        int a = 15;
        System.out.println(expressionOfNumbers.solution(a));
    }
}
