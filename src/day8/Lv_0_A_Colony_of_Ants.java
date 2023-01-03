package day8;

public class Lv_0_A_Colony_of_Ants {
    public int solution(int hp) {
        int answer = 0;

        if(hp % 5 == 0)
            answer = hp / 5;
        else{
            int byung = hp % 5;

            if(byung % 3 == 0)
                answer = (hp / 5) + (byung / 3);
            else
                answer = (hp / 5) + (byung / 3) + (byung % 3);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_A_Colony_of_Ants aColonyOfAnts = new Lv_0_A_Colony_of_Ants();
        int a = 24;
        System.out.println(aColonyOfAnts.solution(a));
    }
}
