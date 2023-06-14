package Lv_2.day58;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class boostcamp_1 {
    public int[] solution(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            if(map.isEmpty())
                map.put(i, 1);
            else{
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        int size = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() >= 2){
                size++;
            }
        }
        int[] answer = new int[size];

        int idx = 0;
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            if(m.getValue() >= 2){
                answer[idx] = m.getValue();
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        boostcamp_1 boostcamp1 = new boostcamp_1();
        int[] arr = {3, 2, 4, 4, 2, 5, 2, 5, 5};
        System.out.println(Arrays.toString(boostcamp1.solution(arr)));
    }
}
