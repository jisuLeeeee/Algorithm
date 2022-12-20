package day4;

public class Lv_0_Sharing_Pizza_1 {
    public int solution(int n) {
        int answer = 0;

        if(n % 7 == 0){
            answer = n / 7;
        }
        else {
            answer = n / 7 + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Sharing_Pizza_1 sharingPizza1 = new Lv_0_Sharing_Pizza_1();
        int n = 15;
        System.out.println(n + "명이 최소 한 조각씩 먹기 위해서 최소 " + sharingPizza1.solution(n) + "판이 필요합니다.");
    }
}
