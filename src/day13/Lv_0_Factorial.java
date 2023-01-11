package day13;

public class Lv_0_Factorial {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for(int i=2; i<=10; i++){
            if(factorial * i > n){
                answer = i - 1;
                break;
            }
            else if(factorial * i == n){
                answer = i;
                break;
            }
            else
                factorial *= i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Factorial factorial = new Lv_0_Factorial();
        int a = 15;
        System.out.println(factorial.solution(a));
    }
}
