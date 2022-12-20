package day4;

public class Lv_0_Sharing_Pizza_3 {
    public int solution(int slice, int n) {
        int answer = 0;

        if(n % slice == 0){
            answer = n / slice;
        }
        else {
            answer = n / slice + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Sharing_Pizza_3 sharingPizza3 = new Lv_0_Sharing_Pizza_3();
        int n = 11;
        int slice = 7;
        System.out.println(n + "명이 " + slice + "조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 " + sharingPizza3.solution(slice, n) + "판이 필요합니다.");

    }
}
