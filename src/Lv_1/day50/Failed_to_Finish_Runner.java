package Lv_1.day50;

import java.util.HashMap;
import java.util.Map;

public class Failed_to_Finish_Runner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String i : participant){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(String c : completion){
            map.put(c, map.get(c)-1);
        }

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue() != 0){
                answer = m.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Failed_to_Finish_Runner failedToFinishRunner = new Failed_to_Finish_Runner();
        String[] participant = {"mislav", "stanko", "mislav", "ana"}, completion = {"stanko", "ana", "mislav"};
        System.out.println(failedToFinishRunner.solution(participant, completion));
    }
}
