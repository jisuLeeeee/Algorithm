package day7;

public class Lv_0_Get_Discount_Clothing_Store {
    public int solution(int price) {
        int answer = 0;

        if(price >= 500000)
            answer = (int)(price * 0.8);
        else if(price >= 300000)
            answer = (int)(price * 0.9);
        else if(price >=100000)
            answer = (int)(price * 0.95);
        else
            answer = price;

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Get_Discount_Clothing_Store getDiscountClothingStore = new Lv_0_Get_Discount_Clothing_Store();
        int a = 130000;
        System.out.println(getDiscountClothingStore.solution(a));
    }
}
