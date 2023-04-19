package Lv_1.day32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Divided_Array {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int len = 0, idx = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                len++;
            }
        }

        answer = new int[len];

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[idx] = arr[i];
                idx++;
            }
        }

        if(len == 0){
            answer = new int [1];
            answer[0] = -1;
        }
        Arrays.sort(answer);

        return answer;

        /*ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0)
            answer.add(-1);

        Collections.sort(answer);
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();



        return result;*/

    }

    public static void main(String[] args) {
        Divided_Array dividedArray = new Divided_Array();
        int[] arr = {5, 2, 10, 23};
        int a = 5;
        for(int i : dividedArray.solution(arr, a))
            System.out.println(i);
    }
}
