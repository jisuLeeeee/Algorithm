package Lv_2.day43;

public class Next_Big_Number {
    public int solution(int n) {
        int answer = n+1;

        while(answer > 0){
            // 2진수의 1의 개수(true bit)를 반환
            if(Integer.bitCount(n) == Integer.bitCount(answer))
                return answer;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Next_Big_Number nextBigNumber = new Next_Big_Number();
        int a = 78;
        System.out.println(nextBigNumber.solution(a));
    }
}
