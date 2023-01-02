package day7;

import java.util.Arrays;
public class Lv_0_Find_Median {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[(array.length / 2)];

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Find_Median findMedian = new Lv_0_Find_Median();
        int[] a = {9, 0, -1, 3, -2}; //문제 제약사항 -> 배열의 길이는 only 홀수
        System.out.println(findMedian.solution(a));
    }
}
