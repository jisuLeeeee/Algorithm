package Lv_3.day65;

import java.util.Collections;
import java.util.PriorityQueue;

public class Double_Priority_Queue {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};

        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();

        for(String op : operations){
            String[] arr = op.split(" ");

            if(arr[0].equals("I")){
                maxQ.add(Integer.parseInt(arr[1]));
                minQ.add(Integer.parseInt(arr[1]));

            }
            if(arr[0].equals("D") && !maxQ.isEmpty()){
                if(arr[1].equals("1")){
                    int max = maxQ.peek();
                    maxQ.remove();
                    minQ.remove(max);
                }
                else{
                    int min = minQ.peek();
                    maxQ.remove(min);
                    minQ.remove();
                }
            }
        }

        if(!maxQ.isEmpty()){
            answer[0] = maxQ.peek();
            answer[1] = minQ.peek();
        }
        return answer;
    }

    public static void main(String[] args) {
        Double_Priority_Queue doublePriorityQueue = new Double_Priority_Queue();
        String[] o = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        for(int i : doublePriorityQueue.solution(o))
            System.out.println(i);
    }
}
