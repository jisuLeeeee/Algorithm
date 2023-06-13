package Lv_2.day57;

import java.util.HashMap;

public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String,Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 1) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key);
        }
        return answer-1;
    }

    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(clothes.solution(a));
    }
}
