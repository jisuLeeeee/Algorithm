package day6;

import java.util.Arrays;

public class Lv_0_Cut_Array {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        /*int[] answer = new int[num2 - num1 + 1];

        for(int i=0; i<answer.length; i++){
            answer[i] = numbers[num1 + i];
        } 위 반복문으로도 풀이 가능 */
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Cut_Array cutArray = new Lv_0_Cut_Array();
        int[] a = {1,2,3,4,5};
        int num1 = 1, num2 = 2;
        for(int i:cutArray.solution(a, num1, num2)){
            System.out.println(i);
        }
    }
}
