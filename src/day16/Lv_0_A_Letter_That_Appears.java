package day16;

import java.util.Arrays;

public class Lv_0_A_Letter_That_Appears {
    public String solution(String s) {
        String answer = "";
        String[] s_arr = s.split("");
        int cnt = 0;
        Arrays.sort(s_arr);

        for(int i=0; i<s_arr.length; i++){
            cnt = 0;
            for(int j=0; j<s_arr.length; j++){
                if(s_arr[i].equals(s_arr[j]))
                    cnt++;
            }
            if(cnt == 1)
                answer += s_arr[i];
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_A_Letter_That_Appears aLetterThatAppears = new Lv_0_A_Letter_That_Appears();
        String a = "abcabcadc";
        System.out.println(aLetterThatAppears.solution(a));
    }
}
