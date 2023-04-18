package Lv_1.day30;

public class Lv_1_N_Number_Space_By_X {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=1; i<=answer.length; i++){
            answer[i-1] = (long)x*i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_1_N_Number_Space_By_X nNumberSpaceByX = new Lv_1_N_Number_Space_By_X();
        int a = 4, b = 3;
        for(long i : nNumberSpaceByX.solution(a,b))
            System.out.println(i);
    }
}
