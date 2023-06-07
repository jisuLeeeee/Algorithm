package Lv_2.day54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Pick_Tangerine {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        int i=0;
        while(k > 0){
            k -= map.get(list.get(i));
            answer++;
            i++;
        }
       return answer;
    }

    public static void main(String[] args) {
        Pick_Tangerine pickTangerine = new Pick_Tangerine();
        int a = 6;
        int[] b = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(pickTangerine.solution(a, b));
    }
}
