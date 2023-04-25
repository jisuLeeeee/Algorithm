package Lv_1.day34;

public class Calculating_the_Shortfall {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;

        for(int i=1; i<=count; i++){
            total += (price * i);
        }

        if(total > money)
            answer = total - money;
        else
            answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Calculating_the_Shortfall calculatingTheShortfall = new Calculating_the_Shortfall();
        int a = 3, b = 20, c = 4;
        System.out.println(calculatingTheShortfall.solution(a, b, c));
    }
}
