package Lv_3.day67;

import java.util.Arrays;
import java.util.ArrayList;

public class Night_Shift_Index {
    public long solution(int n, int[] works) {
        long answer = 0;

        Arrays.sort(works);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=works.length-1; i>=0; i--){
            list.add(works[i]);
        }

        int cnt = n;
        while(cnt > 0){
            int work = list.get(0);
            list.remove(0);
            if(work == 0){
                break;
            }
            work -= 1;
            list.add(work);
            cnt -= 1;
        }
        for(int i=0; i<list.size(); i++){
            answer += list.get(i) * list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Night_Shift_Index nightShiftIndex = new Night_Shift_Index();
        int n = 999;
        int[] w = {800, 100, 55, 45}; // 199, 100 55 45 / 99, 55 45 / 44, 45 / 1
        System.out.println(nightShiftIndex.solution(n, w));

    }
}
