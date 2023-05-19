package Lv_1.day46;

import java.util.ArrayList;
import java.util.List;

public class Mock_Test {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] num1 = {1,2,3,4,5}, num2 = {2,1,2,3,2,4,2,5}, num3 = {3,3,1,1,2,2,4,4,5,5};
        int[] correct = new int[3];
        int max = 0;

        for(int i=0; i<answers.length; i++){
            if(answers[i] == num1[i % num1.length])
                correct[0]++;
            if(answers[i] == num2[i % num2.length])
                correct[1]++;
            if(answers[i] == num3[i % num3.length])
                correct[2]++;
        }

        max = Math.max(correct[0], Math.max(correct[1], correct[2]));

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<correct.length; i++){
            if(max == correct[i]){
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        Mock_Test mockTest = new Mock_Test();
        int[] a = {1,3,2,4,2};
        for(int i : mockTest.solution(a))
            System.out.println(i);
    }
}
