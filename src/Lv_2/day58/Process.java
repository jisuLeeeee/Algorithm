package Lv_2.day58;

import java.util.Collections;
import java.util.PriorityQueue;

public class Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> qu = new PriorityQueue<>(Collections.reverseOrder());

        for(int i: priorities){
            qu.add(i);
        }

        while(!qu.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(qu.peek() == priorities[i]){
                    qu.poll();
                    answer++;
                    if(i == location)
                        return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Process process = new Process();
        int[] a = {2, 1, 3, 2};
        int l = 2;
        System.out.print(process.solution(a, l)); // 5
    }
}
