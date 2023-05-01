package Lv_1.day35;

import java.util.ArrayList;

public class Ternary_Flip {
    public int solution(int n) {
        int answer = 0;
        int baseThree = n, cnt = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(baseThree != 0){
            arr.add(baseThree % 3);
            baseThree /= 3;
        }

        for(int i = arr.size() - 1; i >= 0; i--){
            answer += arr.get(i) * Math.pow(3, cnt);
            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ternary_Flip ternaryFlip = new Ternary_Flip();
        int a = 45;
        System.out.println(ternaryFlip.solution(a));
    }
}
