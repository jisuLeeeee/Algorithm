package Lv_1.day30;

public class Lv_0_Chicken_Coupon {
    public int solution(int chicken) {
        int answer = 0;
        int c = chicken, r = 0;

        while(c >= 1){
            r += c % 10;
            c /= 10;
            answer += c;
        }

        while(r >= 10){
            answer += (r / 10);
            r = (r / 10) + (r % 10);
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Chicken_Coupon chickenCoupon = new Lv_0_Chicken_Coupon();
        int a = 1999;
        System.out.println(chickenCoupon.solution(a));
    }
}
