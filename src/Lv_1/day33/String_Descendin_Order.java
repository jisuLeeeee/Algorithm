package Lv_1.day33;

import java.util.Arrays;
import java.util.Collections;

public class String_Descendin_Order {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(String a : str)
            answer += a;

        return answer;
    }

    public static void main(String[] args) {
        String_Descendin_Order stringDescendinOrder = new String_Descendin_Order();
        String a = "Zbcdefg";
        System.out.println(stringDescendinOrder.solution(a));
    }
}
