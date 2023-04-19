package Lv_1.day32;

public class Colatz_Conjecture {
    public int solution(long num) {
        int answer = 0;
        int cnt = 0;

        while(num != 1){
            if(cnt <= 500){
                if(num % 2 == 0){
                    num /= 2;
                    cnt++;
                }
                else{
                    num = (num * 3) + 1;
                    cnt++;
                }
            }
            else
                return -1;
        }

        answer = cnt;

        return answer;
    }

    public static void main(String[] args) {
        Colatz_Conjecture colatzConjecture = new Colatz_Conjecture();
        long a = 16;
        System.out.println(colatzConjecture.solution(a));
    }
}
