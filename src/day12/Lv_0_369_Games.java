package day12;

public class Lv_0_369_Games {
    public int solution(int order) {
        int answer = 0;
        int len = (int)( Math.log10(order) + 1 );

        for(int i=0; i<len; i++){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9){
                answer++;
                order /= 10;
            }
            else
                order /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_369_Games games_369 = new Lv_0_369_Games();
        int a = 24923;
        System.out.println(games_369.solution(a));
    }
}
