package day10;

public class Lv_0_Find_Divisor {
    public int[] solution(int n) {
        int cnt = 0;
        int idx = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        int[] answer = new int[cnt];

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                answer[idx] = i;
                idx++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Find_Divisor findDivisor = new Lv_0_Find_Divisor();
        int a = 24;
        for(int i:findDivisor.solution(a))
            System.out.println(i);
    }
}
