package Lv_1.day59;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Running_Race {
    public String[] solution(String[] players, String[] callings) {
        int v = 0;

        Map<String, Integer> map = new HashMap<>();

        for(String i : players){
            map.put(i, v);
            v++;
        }

        for(String calling : callings){
            int r = map.get(calling);
            String before = players[r-1];

            //players 배열 갱신
            players[r-1] = calling;
            players[r] = before;

            //map 배열 갱신
            map.put(calling, r-1);
            map.put(before, r);
        }

        return players;
    }
    public static void main(String[] args) {
        Running_Race runningRace = new Running_Race();
        String[] a = {"mumu", "soe", "poe", "kai", "mine"}, b = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(runningRace.solution(a, b)));
    }
}
