package Lv_2.day69;

import java.util.PriorityQueue;

public class Spicyer {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i : scoville){
            pq.add(i);
        }

        while(pq.peek() < K){
            if(pq.size() == 1)
                return -1;
            int sum = 0;
            sum = pq.poll();
            sum += (pq.poll() * 2);
            pq.add(sum);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Spicyer spicyer = new Spicyer();
        int[] s = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(spicyer.solution(s, k));
    }
}
