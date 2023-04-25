package Lv_1.day34;

public class Number_Addtion_of_Divisor {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;

        for(int i=left; i<=right ;i++){
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0)
                answer += i;
            else
                answer -= i;
            cnt = 0;
        }


        return answer;
    }

    public static void main(String[] args) {
        Number_Addtion_of_Divisor numberAddtionOfDivisor = new Number_Addtion_of_Divisor();
        int a = 13, b = 17;
        System.out.println(numberAddtionOfDivisor.solution(a, b));
    }
}
