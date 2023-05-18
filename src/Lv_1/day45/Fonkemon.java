package Lv_1.day45;

import java.util.HashSet;

public class Fonkemon {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> numSet = new HashSet<>();

        for(int i : nums){
            numSet.add(i); // 중복 제거
        }

        // 중복 제거 후 개수 반환
        if(numSet.size() > nums.length / 2){
            return answer = nums.length;
        }
        else {
            return answer = numSet.size();
        }

    }
}
