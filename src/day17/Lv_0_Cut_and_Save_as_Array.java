package day17;

import java.util.Arrays;

public class Lv_0_Cut_and_Save_as_Array {
    public String[] solution(String my_str, int n) {
        String[] answer;
        int cnt = 0, idx=0;

        if(my_str.length() % n == 0)
            answer = new String[my_str.length() / n];
        else
            answer = new String[(my_str.length() / n) + 1];

        while(cnt < my_str.length()){
            if(my_str.length() % n == 0){
                answer[idx] = my_str.substring(cnt, cnt + n);
                idx++;
                cnt += n;
            }
            else{
                if(cnt == my_str.length() - (my_str.length() % n)){
                    answer[idx] = my_str.substring(cnt);
                    break;
                }
                answer[idx] = my_str.substring(cnt, cnt + n);
                idx++;
                cnt += n;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Cut_and_Save_as_Array cutAndSaveAsArray = new Lv_0_Cut_and_Save_as_Array();
        String a = "abc1Addfggg4556b";
        int b = 6;
        for(String i:cutAndSaveAsArray.solution(a, b))
            System.out.println(i);
    }
}
