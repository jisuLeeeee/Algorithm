package Lv_1.day38;

import java.util.ArrayList;
public class Pick_Two_Number_Addtion {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++) {
                if (!list.contains(numbers[i] + numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                if(answer[i] > answer[j]){
                    int tmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tmp;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Pick_Two_Number_Addtion pickTwoNumberAddtion = new Pick_Two_Number_Addtion();
        int[] a = {5,0,2,7};
        for(int i : pickTwoNumberAddtion.solution(a))
            System.out.println(i);
    }
}
