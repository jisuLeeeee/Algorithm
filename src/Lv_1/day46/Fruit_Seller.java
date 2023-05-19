package Lv_1.day46;

import java.util.Arrays;

public class Fruit_Seller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i=score.length-m; i>=0; i-=m){
            answer += (score[i] * m);
        }


        return answer;
    }

    public static void main(String[] args) {
        Fruit_Seller fruitSeller = new Fruit_Seller();
        int a = 4, b= 3;
        int[] c = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(fruitSeller.solution(a, b ,c));
    }
}
