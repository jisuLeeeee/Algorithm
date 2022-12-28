package day5;

import java.util.Arrays;

public class Lv_0_Triangle_Completion_Conditions {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if(sides[2] < sides[0] + sides[1]){
            answer = 1;
        }
        else {
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Triangle_Completion_Conditions triangleCompletionConditions = new Lv_0_Triangle_Completion_Conditions();
        int[] a = {5, 9, 7};
        System.out.println(triangleCompletionConditions.solution(a));
    }
}
