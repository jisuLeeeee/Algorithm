package Lv_1.day30;

public class Lv_1_Remainder_1 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        Lv_1_Remainder_1 remainder1 = new Lv_1_Remainder_1();
        int a = 12;
        System.out.println(remainder1.solution(a));
    }
}
