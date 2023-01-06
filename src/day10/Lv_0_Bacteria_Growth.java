package day10;

public class Lv_0_Bacteria_Growth {
    public int solution(int n, int t) {
        int answer = n;

        for(int i=0; i<t; i++){
            answer *= 2;
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Bacteria_Growth bacteriaGrowth = new Lv_0_Bacteria_Growth();
        int a = 2, b = 10;
        System.out.println(bacteriaGrowth.solution(a,b));

    }
}
