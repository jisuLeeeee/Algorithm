package Lv_1.day79;

import java.util.Arrays;

public class Hall_of_Fame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] k_arr = new int[k];

        answer[0] = score[0];
        k_arr[0] = score[0];

        for(int i=1; i<k; i++){
            if(i == score.length){ // k의 수가 score의 길이보다 클 때 조건문
                return answer;
            }
            if(answer[i-1] < score[i]){
                answer[i] = answer[i-1];
                k_arr[i] = score[i];
            }
            else{
                answer[i] = score[i];
                k_arr[i] = score[i];
            }

        }

        Arrays.sort(k_arr);
        for(int i=k; i<score.length; i++){
            for(int j=0; j<k_arr.length; j++){
                if(score[i] > k_arr[j]){
                    k_arr[j] = score[i];
                    break;
                }
            }
            Arrays.sort(k_arr);
            answer[i] = k_arr[0];
        }
        return answer;
    }

    public static void main(String[] args) {
        Hall_of_Fame hallOfFame = new Hall_of_Fame();
        int k = 10;
        int[] score = {1, 10, 22, 150, 31, 100, 200};
        System.out.println(Arrays.toString(hallOfFame.solution(k, score)));
    }
}
