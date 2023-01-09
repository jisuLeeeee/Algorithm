package day11;

public class Lv_0_Sharing_Pizza_2 {
    public int solution(int n) {
        int answer = 0;
        int p = 6;

        while(p % n != 0)
            p += 6;

        return answer = p / 6;
    }
    public static void main(String[] args) {
        Lv_0_Sharing_Pizza_2 sharingPizza2 = new Lv_0_Sharing_Pizza_2();
        int a = 10;
        System.out.println(sharingPizza2.solution(a));
    }
}
