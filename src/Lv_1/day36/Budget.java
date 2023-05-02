package Lv_1.day36;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);

        for(int i : d){
            sum += i;
            if(sum <= budget)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Budget budget = new Budget();
        int[] a = {1, 3, 5, 2, 4};
        int b = 9;
        System.out.print(budget.solution(a, b));
    }
}
