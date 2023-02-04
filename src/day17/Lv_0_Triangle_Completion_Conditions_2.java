package day17;

import java.util.Arrays;

public class Lv_0_Triangle_Completion_Conditions_2 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        for(int i=sides[1]; i>0; i--){
            if(sides[0] + i <= sides[1])
                break;
            answer++;
        }

        for(int i=sides[1]+1; i<sides[0] + sides[1]; i++){
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Triangle_Completion_Conditions_2 triangleCompletionConditions2 = new Lv_0_Triangle_Completion_Conditions_2();
        int[] a = {3, 6};
        System.out.println(triangleCompletionConditions2.solution(a));
    }
}
