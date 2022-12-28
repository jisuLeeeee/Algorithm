package day5;

public class Lv_0_Ice_Americano {
    public int[] solution(int money) {
        int[] answer = new int [2];

        answer[0] = money / 5500;
        answer[1] = money - (5500 * answer[0]);

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Ice_Americano iceAmericano = new Lv_0_Ice_Americano();
        int a = 15000;
        for (int i:iceAmericano.solution(a))
            System.out.println(i); // 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈
    }
}
