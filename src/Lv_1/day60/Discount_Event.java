package Lv_1.day60;

import java.util.Map;
import java.util.HashMap;

public class Discount_Event {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        //System.out.print(map);

        for(int i=0; i<discount.length - 10 + 1; i++) {
            Map<String, Integer> dMap = new HashMap<>();

            for (int j = 0; j < 10; j++) {
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }

            boolean isIdentical = true;

            for (String key : map.keySet()) {
                if (map.get(key) != dMap.get(key)) {
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical ? 1 : 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Discount_Event discountEvent = new Discount_Event();
        String[] want = {"banana", "apple", "rice", "pork", "pot"}, discount = {"chicken", "apple", "apple", "banana",
                "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int[] cnt = {3, 2, 2, 2, 1};
        System.out.println(discountEvent.solution(want, cnt, discount));

    }
}
