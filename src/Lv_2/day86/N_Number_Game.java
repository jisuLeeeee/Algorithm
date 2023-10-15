package Lv_2.day86;

public class N_Number_Game {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder convert = new StringBuilder();

        for(int i=0; convert.length() <= m*t; i++){
            convert.append(Integer.toString(i, n));
        }

        for(int i=p-1; answer.length()<t; i+=m){
            answer.append(convert.substring(i, i+1));
        }
        return answer.toString().toUpperCase();
    }

    public static void main(String[] args) {
        N_Number_Game nNumberGame = new N_Number_Game();
        int n = 2, t = 4, m = 2, p = 1;
        System.out.println(nNumberGame.solution(n, t, m ,p));
    }
}
