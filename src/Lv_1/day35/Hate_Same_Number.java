package Lv_1.day35;

import java.util.*;

public class Hate_Same_Number {
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(arr[0]);

        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                if(result.get(result.size() - 1) == arr[i+1])
                    continue;
                result.add(arr[i+1]);
            }
            else
                result.add(arr[i+1]);
        }

        answer = result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Hate_Same_Number hateSameNumber = new Hate_Same_Number();
        int[] a = {1, 1, 3, 3, 0, 1, 1};
        for(int i : hateSameNumber.solution(a))
            System.out.println(i);
    }
}
